class A {
    int area(int l, int b) {
        return l * b;
    }
}

class methoddemo {
    public static void main(String args[]) {
        A a1 = new A();
        int r = a1.area(10, 20);
        System.out.println("The area is:" + r);
    }
}
