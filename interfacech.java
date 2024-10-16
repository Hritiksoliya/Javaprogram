interface A {
    void display();
}
class B implements A {
    public void display() {
        System.out.println("B's method");
    }
}
class interfacech{
    public static void main(String args[]) {
        B c1 = new B();
        c1.display();
    }
}