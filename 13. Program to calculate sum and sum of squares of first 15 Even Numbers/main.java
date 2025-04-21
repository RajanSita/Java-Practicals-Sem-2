public class main {
    public static void main(String[] args) {
        int sum = 0;
        int sumOfSquares = 0;
        int count = 0;
        int number = 2;
        
        while (count < 15) {
            sum += number;
            sumOfSquares += number * number;
            number += 2;
            count++;
        }
        
        System.out.println("Sum of first 15 even numbers: " + sum);
        System.out.println("Sum of squares of first 15 even numbers: " + sumOfSquares);
    }
}