// Parent class
class Animal {
    // Method in the parent class
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
        System.out.println("Hritik Patidar : 2403856");
    }
}
// Main class to test single-level inheritance
public class singleLevelinheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        // Calling methods from both the parent class and child class
        myDog.eat();  // Inherited from Animal class
        myDog.bark(); // Defined in Dog class
    }
}

