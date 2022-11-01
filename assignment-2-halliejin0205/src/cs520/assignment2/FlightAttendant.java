package cs520.assignment2;

public class FlightAttendant extends AirlineEmployee {

	// Code goes here
	private boolean firstClass;

	public boolean isFirstClass() {
		return firstClass;
	}

	public void setFirstClass(boolean firstClass) {
		this.firstClass = firstClass;
	}
	public FlightAttendant(String name, boolean firstClass) {
		this.setName(name);
		this.setFirstClass(firstClass);
		this.setJobTitle("Flight Attendant");
		this.setMaxFlightHours(50);
		
	}
}
