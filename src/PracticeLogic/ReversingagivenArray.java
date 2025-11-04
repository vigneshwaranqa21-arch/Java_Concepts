package PracticeLogic;

public class ReversingagivenArray {
	
	public static void main(String [] args) {
		
		
		int arr [] = {1,2,3}; // 0,1,2
		
		int rev[] = new int[arr.length];
		
		int j =0;
		
		for(int i = arr.length-1; i>=0;i--) {
			
			arr[i] = rev[j];
			
			j++;
			
		}
		
		
		
		System.out.println(rev.toString());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
