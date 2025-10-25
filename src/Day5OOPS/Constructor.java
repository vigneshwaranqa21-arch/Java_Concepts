package Day5OOPS;

public class Constructor {

	
	String name;
	
    int age;
	
	int Rollno;
	
	Constructor(String n,int a, int r ){
	
		name = n;   // Left Local instance variable =  Right Parameter variable 
		age = a;
		Rollno =r;
	
		
	System.out.println("Name of the Person"+name);
	System.out.println("Age "+age);
	System.out.println("Rollno "+Rollno);
	
		
	}
	
	public static void main(String[] args) {
		
		
		Constructor co = new Constructor("Vigneshwaran",28,3);
		

	}

}
