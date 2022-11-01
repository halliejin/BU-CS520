/**
 * Module1NumberTest.java (Assignment 1)
 * @halliejin0205
 * Hallie (Zihan Jin)
 */

package cs520.assignment1;

import java.util.Random;

public class Module1NumberTest {

	public static void main(String[] args) {

		// Use the following variable for all random-number generation in this file
		Random random = new Random();

		// Your code goes here
		
		int small = 0, medium = 0, large = 0;
		int limit = random.nextInt(900) + 100;
		
		//Count the occurrences of each type
		/*FEEDBACK: 
		 * if (number <=99){
		 * 		small++;
		 * }
		 * else if (number <= 199){
		 * 		medium++;
		 * }
		 * else {
		 * 		large++;
		 * }
		 * 
		 */
		
		for (int i = 1; i <= limit; i++) {
			int number = random.nextInt(301);
			
			if ((number >= 0) && (number <= 99)) {
				small++;
			}
			else if ((number >=100) && (number <= 199)) {
				medium++;
			}
			else if (number >=200) {
				large++;
			}
		}
		
		//Type casts and percentage calculations
		double limitPct = (double) limit;
		double smallPct = 0.0, mediumPct = 0.0, largePct = 0.0;
		smallPct = 100 * (small / limitPct);
		mediumPct = 100 * (medium / limitPct);
		largePct = 100 * (large / limitPct);
		
		//Display the results
		System.out.printf("The loop ran %d times%n", limit);
		System.out.printf("Small: %d (%2.2f percent)%n", small, smallPct);
		System.out.printf("Medium: %d (%2.2f percent)%n", medium, mediumPct);
		System.out.printf("Large: %d (%2.2f percent)%n", large, largePct);
		
		//Truth test
		/*FEEDBACK:
		 * boolean isEqualToLimit = (limit == (small + medium + large))
		 */
		boolean isEqualToLimit;
		int sum = small + medium + large;
		if (sum == limit) {
			isEqualToLimit = true;
		}
		else {
			isEqualToLimit = false;
		}
		
		//Print the result of the trust test		
		if (isEqualToLimit) {
			System.out.print("Numbers total " + limit);
			
		}
		else {
			System.out.print("Numbers do not total " + limit + "!");
		}

	}

}
