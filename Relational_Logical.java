package day2;

import java.util.Scanner;

public class Relational_Logical {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// Relational Operators
		System.out.println("a == b: " + (a == b)); // false
		
		System.out.println("a != b: " + (a != b)); // true
		
		System.out.println("a > b: " + (a > b));   // false
		System.out.println("a < b: " + (a < b));   // true
		System.out.println("a >= b:" + (a >= b)); // false
		System.out.println("a <= b:" + (a <= b)); // true
		
		// Logical Operators
		boolean x = true;
		boolean y = false;
		
		System.out.println("x && y: " + (x && y)); // false
		System.out.println("x || y: " + (x || y)); // true
		System.out.println("!x: " + (!x));           // false
		System.out.println("!y: " + (!y));           // true
		
		//*********************************************************
		boolean Citizen =true ;
	
		int age = sc.nextInt();
	
		sc.nextLine();
		
		String Nationality = sc.nextLine();
		
		if (age >= 18 && Nationality.equals("IND")) {
			
			System.out.println("Eligible to vote "+ Citizen);
			
		}else {
			
			System.out.println("Not Eligible to vote");
			
		}
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
