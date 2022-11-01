/**
 * Player.java (Assignment 4)
 * @halliejin0205
 * Hallie (Zihan Jin)
 */

package cs520.assignment4;

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
	
	
	public String toString() {
		return "#" + number + ": " + name + "(" + position + " " + year + ")";
		
	}

}
