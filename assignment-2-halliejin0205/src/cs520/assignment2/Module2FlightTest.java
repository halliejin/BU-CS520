/** Module2FlightTest.java (Assignment 2)
 * @halliejin0205 
 * Hallie (ZIHAN JIN)
 */

package cs520.assignment2;

public class Module2FlightTest {

	public static void main(String[] args) {

		// Code goes here
		
		Pilot captain = new Pilot("Alice", true);
		Pilot firstOfficerPilot = new Pilot("Bob", false);
		FlightAttendant flightAttendant1 = new FlightAttendant("Cathy", true);
		FlightAttendant flightAttendant2 = new FlightAttendant("David", false);
		
		//Flight 1: Flight 123 from New York to Tokyo (14hours)
		Flight flight1 = new Flight(123, "Tokyo", 14);
		flight1.setCrew(captain, firstOfficerPilot, flightAttendant1, flightAttendant2);
		flight1.fly();
		
		//Flight 2: Flight 456 from Tokyo to Paris (16 hours)
		Flight flight2 = new Flight(456, "Paris", 16);
		flight2.setCrew(captain, firstOfficerPilot, flightAttendant1, flightAttendant2);
		flight2.fly();
		
		//Flight 3: Flight 789 from Paris to Los Angeles (12 hours)
		Flight flight3 = new Flight(789, "Los Angeles", 12);
		flight3.setCrew(captain, firstOfficerPilot, flightAttendant1, flightAttendant2);
		flight3.fly();
		
		//Create substitute members
		Pilot substituteCaptain = new Pilot("Eason", true);
		Pilot substituteFirstOfficer = new Pilot("Felicia", false);
		flight3.setCrew(substituteCaptain, substituteFirstOfficer, flightAttendant1, flightAttendant2);
		flight3.fly();
		
	
	}


}
