package day2;

import java.util.Scanner;

public class Operators_Assignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		//Ternary Operator (Conditional Operator) Approach 
		
		//condition ? value_if_true : value_if_false;
		
	    String Result  = (a%2==0)?" is a Even Number ":" is a Odd Number";
		
		
		System.out.println(a + Result);
		
		//************************************************************
		
		//If-Else Approach 
		if(a%2==0) {
			System.out.println(a + " is a Even Number");
		}
		else {
			System.out.println(a + " is a Odd Number");
		}
	
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}// main method 

}
