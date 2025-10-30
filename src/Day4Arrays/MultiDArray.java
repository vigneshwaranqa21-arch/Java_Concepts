package Day4Arrays;

import java.util.Random;

public class MultiDArray {

	public static void main(String[] args) {


		int [][] arr = new int [4][4];
		
		Random rand = new Random();
		
		
		for (int i=0;i<arr.length;i++ ) { // outer row		
		
			
			for(int j =0;j<arr.length;j++) {
				
				
				arr[i][j] =rand.nextInt(100)+1;
				
				System.out.println(arr[i][j]);
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
