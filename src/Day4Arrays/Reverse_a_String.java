package Day4Arrays;

import java.util.Scanner;

public class Reverse_a_String {
	
	
	public static void main(String [] args ) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Input text ");
		
		String str = sc.nextLine();
		
		String rev = "";
		
		
		for (int i =0 ; i<str.length();i++) {
			
			
			char ch = str.charAt(i);
			
			rev = ch + rev ;
			
		}
	
			System.out.print(rev);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
