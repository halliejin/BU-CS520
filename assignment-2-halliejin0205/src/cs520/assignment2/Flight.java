package cs520.assignment2;

import java.security.PublicKey;

public class Flight {

	// Your code goes here
	private int flightNumber;
	private String destination;
	private int duration;
	private Pilot captain;
	private Pilot firstOfficer;
	private FlightAttendant flightAttendant1;
	private FlightAttendant flightAttendant2;
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Pilot getCaptain() {
		return captain;
	}
	public void setCaptain(Pilot captain) {
		this.captain = captain;
	}
	public Pilot getFirstOfficer() {
		return firstOfficer;
	}
	public void setFirstOfficer(Pilot firstOfficer) {
		this.firstOfficer = firstOfficer;
	}
	public FlightAttendant getFlightAttendant1() {
		return flightAttendant1;
	}
	public void setFlightAttendant1(FlightAttendant flightAttendant1) {
		this.flightAttendant1 = flightAttendant1;
	}
	public FlightAttendant getFlightAttendant2() {
		return flightAttendant2;
	}
	public void setFlightAttendant2(FlightAttendant flightAttendant2) {
		this.flightAttendant2 = flightAttendant2;
	}
	
	
	public Flight(int flightNumber, String destination, int duration) {
		this.setFlightNumber(flightNumber);
		this.setDestination(destination);
		this.setDuration(duration);
	
	}
	
	public void fly() {
		
		if (this.isCrewValid()) {
			captain.addFlightHours(this.duration);
			firstOfficer.addFlightHours(this.duration);
			flightAttendant1.addFlightHours(this.duration);
			flightAttendant2.addFlightHours(this.duration);
			
			System.out.printf("Flight %d for %s is now departing. It will arrive in %d hours.%n%n", 
					this.flightNumber, this.destination, this.duration);
		}
		else {
			System.out.println("Can't take off because of invalid crew.\n");
		}
	}
		
	// The following methods are commented out because they will fail until your code is added above
	// To make them available, remove /** and */
	// Do not change the contents of these methods
	// Review the code in the methods and reach out to your facilitator if you have questions about it

	

	public void setCrew(Pilot captain, Pilot firstOfficer, FlightAttendant flightAttendant1,
		FlightAttendant flightAttendant2) {
		this.setCaptain(captain);
		this.setFirstOfficer(firstOfficer);
		this.setFlightAttendant1(flightAttendant1);
		this.setFlightAttendant2(flightAttendant2);
		this.printCrewDetails();
	}

	public void printCrewDetails() {
		System.out.printf("Here is the crew for flight %d to %s:%n", this.flightNumber, this.destination);
		System.out.printf("Captain %s has flown %d/%d hours%n", this.captain.getName(),
	 		this.captain.getFlightHours(), this.captain.getMaxFlightHours());
		System.out.printf("First Officer %s has flown %d/%d hours%n", this.firstOfficer.getName(),
	 		this.firstOfficer.getFlightHours(), this.firstOfficer.getMaxFlightHours());
		System.out.printf("Flight Attendant 1 %s has flown %d/%d hours%n", this.flightAttendant1.getName(),
	 		this.flightAttendant1.getFlightHours(), this.flightAttendant1.getMaxFlightHours());
		System.out.printf("Flight Attendant 2 %s has flown %d/%d hours%n", this.flightAttendant2.getName(),
	 		this.flightAttendant2.getFlightHours(), this.flightAttendant2.getMaxFlightHours());
	}

	private boolean isCrewValid() {
		boolean validRoles = this.captain.isCaptainRank() && !this.firstOfficer.isCaptainRank() &&
				this.flightAttendant1.isFirstClass() && !this.flightAttendant2.isFirstClass();
		if (!validRoles) {
			System.out.println("Crew members are not in the proper roles.");
			return false;
		} else {
			if (this.determineAvailability(this.captain) && this.determineAvailability(this.firstOfficer) &&
					this.determineAvailability(this.flightAttendant1) && this.determineAvailability(this.flightAttendant2)) {
				System.out.println("Crew members verified.");
				return true;
			} else {
				System.out.println("One or more crew members are not available for this flight.");
				return false;
			}
		}
	}

	public boolean determineAvailability(AirlineEmployee employee) {
		if (employee.isAvailable(this.duration)) {
			System.out.printf("%s %s is available%n", employee.getJobTitle(), employee.getName());
			return true;
		} else {
			System.out.printf("%s %s is NOT available%n", employee.getJobTitle(), employee.getName());
			return false;
		}
	}

	
}
