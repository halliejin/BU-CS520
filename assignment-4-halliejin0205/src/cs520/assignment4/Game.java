package cs520.assignment4;

import java.util.List;
import java.util.Random;

public class Game {
	private int month;
	private int day;
	private int year;
	private String teamName;
	private String opponentName;
	private List<Player> players;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getOpponentName() {
		return opponentName;
	}
	public void setOpponentName(String opponentName) {
		this.opponentName = opponentName;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	public void setDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		
	}
	
	public void simulateGame() {
		System.out.printf("Game played on " + "%d/%d/%d " + "vs. " + "%s\n", 
				this.month, this.day, this.year, this.opponentName);
		
		int teamPoints = 0;
		Random random= new Random();
		
		for (Player player: players) {

			int points = random.nextInt(1,10);
			teamPoints = teamPoints + points;
			
			System.out.println(player.toString() + " scored " + points + " points");
		}
		int opponentPoints = random.nextInt(1,100);
		System.out.printf("Final score: %s %d, %s %d\n", 
				teamName, teamPoints, opponentName, opponentPoints);
		
		System.out.println();
				
		
	}
		
}


