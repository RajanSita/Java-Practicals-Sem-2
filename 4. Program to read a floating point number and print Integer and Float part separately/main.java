import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a floating point number: ");
        float number = scanner.nextFloat();
        
        int integerPart = (int)number;
        float floatPart = number - integerPart;
        
        System.out.println("Integer part: " + integerPart);
        System.out.println("Float part: " + floatPart);
        
        scanner.close();
    }
}