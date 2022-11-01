package cs520.assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Database {
	private static final String URL= "jdbc:mysql://metcs520.mysql.database.azure.com:3306/zjin0205";
	private static final String USERNAME = "zjin0205@metcs520";
	private static final String PASSWORD = "metcs520";
	
	public void insertPlayers(Collection<Player> players) throws DatabaseException {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();
			
			Iterator<Player> iterator = players.iterator();
			
			while (iterator.hasNext()) {
				Player nextItem = iterator.next();
				String query = "delete from players where number = ?";
				PreparedStatement pstmt1 = conn.prepareStatement(query);
				pstmt1.setInt(1, nextItem.getNumber());
				stmt.executeUpdate(query);
				
				
				query = "insert into players values (?, ?, ?, ?)";
				String.format(query);
				PreparedStatement pstmt2 = conn.prepareStatement(query);
				pstmt2.setInt(1, nextItem.getNumber());
				pstmt2.setString(2, nextItem.getName());
				pstmt2.setString(3, nextItem.getPosition());
				pstmt2.setString(4, nextItem.getYear());
				stmt.executeUpdate(query);
			
				System.out.printf("Inserting player into database: (%d, '%s', '%s', '%s')",
								nextItem.getNumber(), nextItem.getName(), nextItem.getPosition(), nextItem.getYear());	
				pstmt1.close();
				pstmt2.close();
			}
		}catch (Exception e) {
			throw new DatabaseException(e);
		}finally {
			try {
				if (conn != null) {
					conn.close();
					stmt.close();
				}
			} catch (Exception e) {
				
			}
		}	
	}
	public Map<String, Player> selectPlayers() throws DatabaseException{
		HashMap<String, Player> players = new HashMap<String, Player>();
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from players");
			
			while (rs.next()) {
				Player player = new Player();
				
				rs.getInt("NUMBER");
				rs.getString("NAME");
				rs.getString("POSITION");
				rs.getString("YEAR");
				
				players.put(Integer.toString(player.getNumber()), player);
				players.put(player.getName(), player);
				players.put(player.getPosition(),player);
				players.put(player.getYear(),player);
				
			}
		}catch (Exception e){
			throw new DatabaseException(e);
		}finally {
			try {
				if (conn != null) {
					conn.close();
					stmt.close();
				}
			} catch (Exception e) {
				
			}
		}
		return players;
		
		
		
	}

}
