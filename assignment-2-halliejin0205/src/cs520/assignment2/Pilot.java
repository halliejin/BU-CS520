package cs520.assignment2;

public class Pilot extends AirlineEmployee {

	// Code goes here
	
	private boolean captainRank;

	public boolean isCaptainRank() {
		return captainRank;
	}

	public void setCaptainRank(boolean captainRank) {
		this.captainRank = captainRank;
	}
	
	public Pilot(String name, boolean captainRank) {
		this.setName(name);
		this.setCaptainRank(captainRank);
		this.setJobTitle("Pilot");
		this.setMaxFlightHours(40);
	}
}
