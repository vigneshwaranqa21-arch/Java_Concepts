package PracticeLogic;

import java.util.HashSet;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {


		// Set Interface
		
		Set<Object> set = new HashSet<>(); 
	
		set.add("Hap");
		set.add(99);
		
		
		//System.out.print(set);
		
		
		int arr [] = {10,6,7,4,6};
		
		
		for(int x:arr) {
			
			
			set.add(x);
			
		}
				
		System.out.println(set);
		
		
		
		
		
		
		
		

	}

}
