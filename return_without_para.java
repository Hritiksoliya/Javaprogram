class return_without_para {
    int l = 10, b = 20;

    int area() {
        return l * b;
    }
}

class methoddemo {
    public static void main(String args[]) {
        return_without_para a1 = new return_without_para();
        int r = a1.area();
        System.out.println("hritik patidar :scolr --2403856 ");
        System.out.println("The area is: " + r);
    }
}
