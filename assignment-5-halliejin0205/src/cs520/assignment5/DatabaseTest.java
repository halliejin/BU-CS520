/**
 * DatabaseTest.java (Assignment 5)
 * @author YOUR NAME
 */

package cs520.assignment5;

import java.io.File;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DatabaseTest {

	// Copy main() and createPlayer() from TeamTest (Assignment 4) here and
	// make the modifications listed in the Assignment 5 document.
	public static Player createPlayer(String number, String name, String position, String year) {
		int num = Integer.parseInt(number);
		
		Player player = new Player();
		
		player.setNumber(num);
		player.setPosition(position);
		player.setYear(year);
		
		return player;
		
		
	}
	
	public static void main(String args[]) {
		Scanner scanner = null;
		/*
		In a LinkedHashSet, the elements are ordered based on the order in which they are inserted.
		
		This will avoid the problems that HashSet cannot guarantee the order of the elements in the set
		and cannot maintain the insertion order of the elements.
		
		It will also avoid the problem that ArrayList allows duplicate values. 
		 
		 */
		
		LinkedHashSet<Player> players = new LinkedHashSet<Player>();
		
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
			
			Database db = new Database();
			db.insertPlayers(players);
			Map<String,Player> selectedPlayers = db.selectPlayers();
			
			Iterator<String> iter = selectedPlayers.keySet().iterator();
			while (iter.hasNext()) {
			    String value = iter.next();
			    System.out.println(iter + ": " + value);
			}
			
//			while (nameIterator.hasNext()) {
//				String name = nameIterator.next();
//				System.out.printf(name + ": " + players);
//			}

					
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if (scanner != null) {
				scanner.close();
			}
		
	}
}
}
