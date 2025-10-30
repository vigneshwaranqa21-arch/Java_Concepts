package Day6PolyMorphism;

class Animal {
    void sound() { System.out.println("Animal makes a sound"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }  // Overriding
}
public class MethodOverloading {
    public static void main(String[] args) {
        Animal a = new Dog();  // Parent reference, Child object
        a.sound();             // Calls Dog’s version
    }
}
