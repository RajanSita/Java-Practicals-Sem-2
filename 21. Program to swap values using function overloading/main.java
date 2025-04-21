import java.util.Scanner;

public class main {
    // Function to swap integers
    public static void swap(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
    
    // Function to swap floats
    public static void swap(float[] a, float[] b) {
        float temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
    
    // Function to swap characters
    public static void swap(char[] a, char[] b) {
        char temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Integer swap
        System.out.println("Integer Swap:");
        System.out.print("Enter first integer: ");
        int[] int1 = {scanner.nextInt()};
        System.out.print("Enter second integer: ");
        int[] int2 = {scanner.nextInt()};
        
        System.out.println("Before swap: int1 = " + int1[0] + ", int2 = " + int2[0]);
        swap(int1, int2);
        System.out.println("After swap: int1 = " + int1[0] + ", int2 = " + int2[0]);
        
        // Float swap
        System.out.println("\nFloat Swap:");
        System.out.print("Enter first float: ");
        float[] float1 = {scanner.nextFloat()};
        System.out.print("Enter second float: ");
        float[] float2 = {scanner.nextFloat()};
        
        System.out.println("Before swap: float1 = " + float1[0] + ", float2 = " + float2[0]);
        swap(float1, float2);
        System.out.println("After swap: float1 = " + float1[0] + ", float2 = " + float2[0]);
        
        // Clear the input buffer
        scanner.nextLine();
        
        // Character swap
        System.out.println("\nCharacter Swap:");
        System.out.print("Enter first character: ");
        char[] char1 = {scanner.nextLine().charAt(0)};
        System.out.print("Enter second character: ");
        char[] char2 = {scanner.nextLine().charAt(0)};
        
        System.out.println("Before swap: char1 = " + char1[0] + ", char2 = " + char2[0]);
        swap(char1, char2);
        System.out.println("After swap: char1 = " + char1[0] + ", char2 = " + char2[0]);
        
        scanner.close();
    }
}