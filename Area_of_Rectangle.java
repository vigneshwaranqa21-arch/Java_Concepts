package day2;

import java.util.Scanner;

public class Area_of_Rectangle {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int length = sc.nextInt();
		
		int breadth = sc.nextInt();
		
		int area = length * breadth;
		
		System.out.println("Area of a Rectangle is "+ area);
		
		sc.close();
				

		
	}

}
