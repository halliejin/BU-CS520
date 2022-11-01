/**
 * TeamTest.java (Assignment 3, Part 2)
 * @halliejin0205
 * Hallie (Zihan Jin)
 */

package cs520.assignment3.part2;

import java.io.File;
import java.util.Scanner;

public class TeamTest {
	
	public static double createPlayer(String number, String name, String position, String year) {
		int num = Integer.parseInt(number);
		
		Player player = new Player(name);
		
		player.setNumber(num);
		player.setPosition(position);
		player.setYear(year);
		double x = player.computeScoringAverag();
		System.out.println(player.toString() + ": " + x);
		
		return x;
		
		
	}
	
	public static void main(String args[]) {
		
		Scanner scanner = null;
		
		try {
			double totalScoringAverage = 0;
			
			File file = new File("team.txt");
			scanner = new Scanner(file);
			
			
			while (scanner.hasNextLine()) {
				
				String number = scanner.nextLine();
				String name = scanner.nextLine();
				String position = scanner.nextLine();
				String year = scanner.nextLine();
				scanner.nextLine();
				
				double result = createPlayer(number, name, position, year);
				
				totalScoringAverage += result;
				
				
			}
		
			System.out.println("Average score: " + totalScoringAverage/10);
			
		}catch(Exception e) {
			
		}finally {
			if (scanner != null) {
				scanner.close();
			}
		
	}
}
}


