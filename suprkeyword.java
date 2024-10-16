class A {
   protected int l, b;
    // Constructor for class A
    A() {
        l = 10;  // Initialize l
        b = 20;  // Initialize b
    }
}

// Class B inherits from class A
class B extends A {
    int h;
    // Constructor for class B
    B() {
        super();
        h = 30;   // Initialize h
    }

    // Method to calculate volume
    int volume() {
        return l * b * h;  // Calculates volume using inherited l and b, and h
    }
}

// Main class to test the code
class suprkeyword{
    public static void main(String args[]) {
        B b1 = new B();   // Create an object of class B
        int r = b1.volume();  // Call the volume method

        // Output the results
        System.out.println("The vol. is: " + r);
        System.out.println("Hritik Patidar : 2403856");  // Prints the name and roll number
    }
}
