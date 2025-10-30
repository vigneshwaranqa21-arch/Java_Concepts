package Day6PolyMorphism;




//Interface
interface Animall {
 void sound();  // method without body
}

//Class implementing interface
class Dog1 implements Animall {
 public void sound() {  // must use 'public'
     System.out.println("Dog barks");
 }
}

//Main class
public class TestInterface {
 public static void main(String[] args) {
     Dog1 d = new Dog1();
     d.sound();
 }
}
