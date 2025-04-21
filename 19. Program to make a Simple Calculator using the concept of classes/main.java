import java.util.Scanner;

class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return num1 / num2;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nOperations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        System.out.print("\nEnter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = calc.add(num1, num2);
                System.out.println("Result of addition: " + result);
                break;
            case 2:
                result = calc.subtract(num1, num2);
                System.out.println("Result of subtraction: " + result);
                break;
            case 3:
                result = calc.multiply(num1, num2);
                System.out.println("Result of multiplication: " + result);
                break;
            case 4:
                result = calc.divide(num1, num2);
                System.out.println("Result of division: " + result);
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}