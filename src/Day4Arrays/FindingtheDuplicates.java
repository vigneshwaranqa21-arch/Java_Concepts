package Day4Arrays;

public class FindingtheDuplicates {

	public static void main(String[] args) {


		int arr [] = {1,5,6,5,7,8,9,7};
		
		int occurance = 0;
		
		for(int i = 0;i<arr.length;i++){
			
		
			for(int j = i+1; j<arr.length;j++) {
				
	
				if(arr[i]==arr[j]) {
				
					
					System.out.println("Duplicates are " +  arr[i]);
					
					occurance++;
					
				}
				
			}
		
			
		}
		
		
		System.out.println("Duplictae Occurance is " +  occurance + " times.");
		
		
		
		
		
		
		
		
		
		

	}

}
