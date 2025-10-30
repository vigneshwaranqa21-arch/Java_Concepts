package Day6PolyMorphism;

//Parent class
class AnimalDemo {
    void eat() {
        System.out.println("Animal eats food");
    }

    void eat(String food) {
        System.out.println("Animal eats " + food);
    }
}

//Child class (Inheritance)
class DogDemo extends AnimalDemo {
    @Override
    void eat() {
        System.out.println("Dog eats bones");
    }

    void bark() {
        System.out.println("Dog barks loudly");
    }
}

//Main class
public class OOPSImplementation {
    public static void main(String[] args) {
        DogDemo d = new DogDemo();
        d.eat("meat");  // overloading
        d.eat();        // overridings
        d.bark();       // own method
    }
}

