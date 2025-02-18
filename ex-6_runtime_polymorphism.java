//runtime polymorphism

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal myAnimal; // Reference variable of type Animal

        myAnimal = new Dog();
        myAnimal.sound(); // Outputs: Dog barks

        myAnimal = new Cat();
        myAnimal.sound(); // Outputs: Cat meows
    }
}
