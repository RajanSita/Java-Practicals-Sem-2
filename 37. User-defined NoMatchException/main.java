import java.util.Scanner;

class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class main {
    public static void validate(int num) throws NoMatchException {
        if (num != 10) {
            throw new NoMatchException("Number does not match 10");
        } else {
            System.out.println("Correct number entered.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        try {
            validate(input);
        } catch (NoMatchException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
