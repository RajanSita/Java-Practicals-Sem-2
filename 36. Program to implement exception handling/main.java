import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Program ended.");
            sc.close();
        }
    }
}
