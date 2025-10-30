package Day6PolyMorphism;

//Class with encapsulation
class Student {
 // private field — cannot be accessed directly
 private String name;

 // public setter method — to set value
 public void setName(String n) {
     name = n;
 }

 // public getter method — to get value
 public String getName() {
     return name;
 }
}

//Main class
public class Encapsulation {
 public static void main(String[] args) {
     Student s = new Student();
     s.setName("Vignesh");          // setting value using setter
     System.out.println(s.getName()); // getting value using getter
 }
}
