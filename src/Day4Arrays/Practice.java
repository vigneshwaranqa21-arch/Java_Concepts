package Day4Arrays;
import java.util.Arrays; 

public class Practice {
	
	
	public static void main(String[]args) {
		

		int arr[] = {1,2,3,4,5,6,7,8,9};
		
	
		int rev[] = new int [arr.length];
		
		int j =0;
		
		for(int i = arr.length-1; i>=0; i--) {
			
			
			rev[j] = arr[i];
			
		    j = j+1;
			
		}
		

		for(int k =0 ;k<=rev.length-1 ;k++) {
			
			
			System.out.println(rev[k]);
			
		}
		
		
		
		
		
		
		
		
		
		}
		
		
		
 
 
 
 
}
