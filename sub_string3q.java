import java.util.Arrays;
public class sub_string3q {
    public static void main(String[] args) {
        String str = "Hello World, Welcome to Java Programming!";
        
        // 1. Get a substring of a string (from index 6 to 11)
        String substring = str.substring(6, 11);
        System.out.println("Substring (from index 6 to 11): " + substring);
        
        // 2. Get all words of the string (split by space)
        String[] words = str.split(" ");
        System.out.println("All words of the string: " + Arrays.toString(words));
        
        // 3. Convert the string into a character array
        char[] charArray = str.toCharArray();
        System.out.println("Character array of the string: " + Arrays.toString(charArray));
        System.out.println("Hritik Patidar : 2403856");
    }
}
