// Grandparent class
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
// Parent class (inherits from Animal)
class Mammal extends Animal {
    public void walk() {
        System.out.println("This mammal walks.");
    }
}
// Child class (inherits from Mammal)
class Dog extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
        System.out.println("Hritik Patidar : 2403856");
    }
}

// Main class to test multilevel inheritance
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();

        // Calling methods from all three classes
        myDog.eat();  // Inherited from Animal class
        myDog.walk(); // Inherited from Mammal class
        myDog.bark(); // Defined in Dog class
    }
}
