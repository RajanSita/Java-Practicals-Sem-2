import java.util.Scanner;

// Custom exception class
class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Check if number is 10
            if (number != 10) {
                throw new NoMatchException("The number entered is not 10!");
            } else {
                System.out.println("You entered the correct number: 10");
            }
        } catch (NoMatchException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}