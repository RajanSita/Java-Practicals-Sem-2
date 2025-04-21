import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            
            int result = divideNumbers(num1, num2);
            System.out.println("Result of division: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
            System.out.println("Exception details: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers");
            System.out.println("Exception details: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred");
            System.out.println("Exception details: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of exception");
            scanner.close();
        }
        
        System.out.println("Program completed execution");
    }
    
    public static int divideNumbers(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}