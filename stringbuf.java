public class stringbuf {

    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Hello ");

        sb.append("Java");// now original string is changed

        System.out.println(sb);// prints Hello Java

        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.insert(1, "Java");// now original string is changed
        System.out.println(sb1);// prints HJavaello
        System.out.println("Hritik Patidar : 2403856");
    }

}
