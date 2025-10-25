	package day3;
	
	import java.util.Scanner;
	
	public class Calculator_Switch {
		
		
		public static void main(String[]args) {
			
			
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter the number a");
		
		double a = sc.nextDouble();
		
		System.out.println("Enter the number b");
		
		double b = sc.nextDouble();
					
		System.out.println("Enter the operator");
	
		char operator = sc.next().charAt(0);
			
		double result ;
				
		switch (operator) {
				
	    case '+':
					
     	result = a + b;
				 
     	System.out.println("Addition result "+ result);
		break;
				
		case '-':			
		result = a - b ;
		
     	System.out.println("Subraction result "+ result);
		break;
		
		case '*':
			
		result = a * b ;
		
		System.out.println("Subraction result "+ result);;
		
		break;
		
		case '/':
			
		result = a/b;
		
		System.out.print("Division result Numerator "+ result);
		
		break;
		
		case '%':
		
		result = a%b;
			
		System.out.print("Division result Denominator (Modulus) "+ result);
		
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
