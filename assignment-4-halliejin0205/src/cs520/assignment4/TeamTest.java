/**
 * TeamTest.java (Assignment 5)
 * @halliejin0205
 * Hallie (Zihan Jin)
 */

package cs520.assignment4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamTest {
	
	public static Player createPlayer(String number, String name, String position, String year) {
		int num = Integer.parseInt(number);
		
		Player player = new Player(name);
		
		player.setNumber(num);
		player.setPosition(position);
		player.setYear(year);
		
		return player;
		
		
	}
	
	public static void main(String args[]) {
		
		List<Player> players = new ArrayList<Player>();
		Scanner scanner = null;
		
		try {
			
			File file = new File("team.txt");
			scanner = new Scanner(file);
			
			
			while (scanner.hasNextLine()) {
				
				String number = scanner.nextLine();
				String name = scanner.nextLine();
				String position = scanner.nextLine();
				String year = scanner.nextLine();
				scanner.nextLine();
				
				Player player = createPlayer(number, name, position, year);
				
				players.add(player);
	
			}
			
			String[] opponents = new String[] {"BC", "Northeastern", "Harvard", "MIT", "UMass"};
			
			for(String op: opponents) {
				Game game = new Game();
				game.setTeamName("SKT");
				game.setOpponentName(op);
				game.setDate(02,05,22);
				game.setPlayers(players);
				game.simulateGame();
				
			}
		
					
		}catch(Exception e) {
			
		}finally {
			if (scanner != null) {
				scanner.close();
			}
		
	}
}
}


