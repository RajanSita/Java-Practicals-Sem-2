import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial velocity (u): ");
        double u = scanner.nextDouble();
        
        System.out.print("Enter time (t): ");
        double t = scanner.nextDouble();
        
        System.out.print("Enter acceleration (a): ");
        double a = scanner.nextDouble();
        
        double displacement = u * t + 0.5 * a * Math.pow(t, 2);
        
        System.out.println("Displacement: " + displacement);
        
        scanner.close();
    }
}