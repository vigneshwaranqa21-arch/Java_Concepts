package Day4Arrays;

public class ReverseArrayPositionSwap {

	public static void main(String[] args) {
		
		
		int arr[] = {1,2,6,7,8,9};
		
		
		for(int i =0 ;i<arr.length/2;i++) {
			
			
			int temp = arr[i];
			
			arr[i]= arr[arr.length-1-i];
			
			arr[arr.length-1-i]=temp;
			
			
		}
		
		for(int j=0;j<arr.length;j++) {
		
			
			System.out.println(arr[j]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
