public class main {
    // Call by value - primitive types
    public static void changeValue(int x) {
        System.out.println("Inside changeValue, before: x = " + x);
        x = 100;  // This change is local to this method
        System.out.println("Inside changeValue, after: x = " + x);
    }
    
    // Call by reference - reference types (using arrays)
    public static void changeArray(int[] arr) {
        System.out.println("Inside changeArray, before: arr[0] = " + arr[0]);
        arr[0] = 100;  // This change affects the original array
        System.out.println("Inside changeArray, after: arr[0] = " + arr[0]);
    }
    
    public static void main(String[] args) {
        // Call by value demonstration
        int num = 10;
        System.out.println("Before calling changeValue: num = " + num);
        changeValue(num);
        System.out.println("After calling changeValue: num = " + num);  // Value remains unchanged
        
        System.out.println("\n-------------------\n");
        
        // Call by reference demonstration
        int[] array = {10, 20, 30};
        System.out.println("Before calling changeArray: array[0] = " + array[0]);
        changeArray(array);
        System.out.println("After calling changeArray: array[0] = " + array[0]);  // Value is changed
    }
}