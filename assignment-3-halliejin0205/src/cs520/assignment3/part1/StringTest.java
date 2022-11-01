/**
 * StringTest.java (Assignment 3, Part 1)
 * @halliejin0205
 * Hallie (Zihan Jin)
 */

package cs520.assignment3.part1;

import java.util.Scanner;

public class StringTest {
	public static void main(String args[]) {
		try {
			System.out.println("Please enter name,age,city: ");
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			input = input.trim();
			
			//Name
			int index1 = input.indexOf(",");
			String name = input.substring(0, index1);
			System.out.println("Name: " + name + "(length: " + index1 +")");
			
			//Age
			int index2 = input.indexOf(",", index1 + 1);
			String ageString = input.substring(index1 + 1, index2);
			int age = Integer.parseInt(ageString);
			System.out.println("Age: " + age);
			System.out.println("Age in 10 years: " + (age + 10));
			
			//City
			String city = input.substring(index2 + 1, input.length());
			System.out.println("City: " + city + "(length: " + (input.length() - (index2 + 1)) + ")");
			
			s.close();
		
		}catch(Exception e){
			System.out.println("Something went wrong.");
		}
			
	}


}
