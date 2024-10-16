import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        int operation;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");
        operation = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        double result = 0;
        switch (operation) {
            case 1: // Addition
                result = num1 + num2;
                break;
            case 2: // Subtraction
                result = num1 - num2;
                break;
            case 3: // Multiplication
                result = num1 * num2;
                break;
            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice! Please select from 1, 2, 3, or 4.");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);
        System.out.println("hritik patidar :scolr --2403856 ");

    }
}
