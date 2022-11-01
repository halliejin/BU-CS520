package cs520.assignment2;

public class AirlineEmployee {

	// Code goes here
	
	//Create instance variables
	private String jobTitle;
	private String name;
	private int flightHours;
	private int maxFlightHours;
	
	//Generating getter and setter for all instance variables
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFlightHours() {
		return flightHours;
	}
	public void setFlightHours(int flightHours) {
		this.flightHours = flightHours;
	}
	public int getMaxFlightHours() {
		return maxFlightHours;
	}
	public void setMaxFlightHours(int maxFlightHours) {
		this.maxFlightHours = maxFlightHours;
	}
	
	//Create addFlightHours
	public void addFlightHours(int hours) {
		this.flightHours += hours;
	}
	
	//Create isAvailable
	public boolean isAvailable(int duration) {
		return (this.flightHours + duration <= this.maxFlightHours);
		
	}
	
}
