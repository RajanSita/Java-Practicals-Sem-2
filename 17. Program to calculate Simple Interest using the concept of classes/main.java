import java.util.Scanner;

class SimpleInterest {
    private double principal;
    private double rate;
    private double time;
    
    public void setData(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }
    
    public double calculate() {
        return (principal * rate * time) / 100;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter rate of interest (per annum): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
        
        SimpleInterest si = new SimpleInterest();
        si.setData(principal, rate, time);
        
        double interest = si.calculate();
        
        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount: " + (principal + interest));
        
        scanner.close();
    }
}