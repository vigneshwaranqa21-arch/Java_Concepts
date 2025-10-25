package Day5OOPS;

class Student{         // why am not able to add public before the class 
	
	String name ;
	
	int rollno;
	
	int age;

	
	void display() {

		System.out.println("Student name is "+ name);
		System.out.println("Roll number is  "+ rollno);
		System.out.println("Student age is  "+ age);
	}

	
	}

public class OOPS {

	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.age = 28;
		st.name = "Vigneshwaran";
		st.rollno = 03;
		
		st.display();
					
	}

}
