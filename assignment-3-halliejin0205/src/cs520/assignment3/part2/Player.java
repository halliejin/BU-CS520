/**
 * Player.java (Assignment 3, Part 2)
 * @halliejin0205
 * Hallie (Zihan Jin)
 */

package cs520.assignment3.part2;

import java.util.Random;

public class Player {
	
	private int number;
	private String name;
	private String position;
	private String year;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	public Player(String name){
		this.name = name;
		
	}
	
	public double computeScoringAverag() {
		Random random = new Random();
		double ran = random.nextDouble(0.0, 10.0);
		return ran; 
	}
	
	public String toString() {
		return "#" + number + ": " + name + "(" + position + " " + year + ")";
		
	}

}
