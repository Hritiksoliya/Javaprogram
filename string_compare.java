public class string_compare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Using equals() method to compare strings
        if (str1.equals(str2)) {
            System.out.println("Strings are equal using equals() method.");
        } else {
            System.out.println("Strings are not equal using equals() method.");
        }

        // Using compareTo() method to compare strings
        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("Strings are equal using compareTo() method.");
        } else if (result > 0) {
            System.out.println("str1 is greater than str2 using compareTo() method.");
        } else {
            System.out.println("str1 is less than str2 using compareTo() method.");
            System.out.println("hritik Patidar : 2403856");
        }
    }
}
