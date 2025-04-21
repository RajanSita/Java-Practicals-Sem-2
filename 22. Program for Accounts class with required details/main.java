import java.util.Scanner;

class Accounts {
    private int ac_no;
    private String name;
    private String ac_name;
    private double balance;
    
    // Constructor
    public Accounts(int ac_no, String name, String ac_name, double balance) {
        this.ac_no = ac_no;
        this.name = name;
        this.ac_name = ac_name;
        this.balance = balance;
    }
    
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + ac_no);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Type: " + ac_name);
        System.out.println("Balance: " + balance);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Account Number: ");
        int accountNo = scanner.nextInt();
        scanner.nextLine();  // Clear buffer
        
        System.out.print("Enter Account Holder Name: ");
        String holderName = scanner.nextLine();
        
        System.out.print("Enter Account Type: ");
        String accountType = scanner.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        
        // Create account using constructor
        Accounts account = new Accounts(accountNo, holderName, accountType, initialBalance);
        
        int choice;
        do {
            System.out.println("\nAccount Operations:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("0. Exit");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdrawal(withdrawalAmount);
                    break;
                case 3:
                    account.display();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}