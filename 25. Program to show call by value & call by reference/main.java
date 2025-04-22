public class main {
    public static void changeValue(int x) {
        System.out.println("Inside changeValue, before: x = " + x);
        x = 100;
        System.out.println("Inside changeValue, after: x = " + x);
    }
    public static void changeArray(int[] arr) {
        System.out.println("Inside changeArray, before: arr[0] = " + arr[0]);
        arr[0] = 100;  
        System.out.println("Inside changeArray, after: arr[0] = " + arr[0]);
    }
    
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before calling changeValue: num = " + num);
        changeValue(num);
        System.out.println("After calling changeValue: num = " + num); 
        
        System.out.println("\n-------------------\n");
        int[] array = {10, 20, 30};
        System.out.println("Before calling changeArray: array[0] = " + array[0]);
        changeArray(array);
        System.out.println("After calling changeArray: array[0] = " + array[0]); 
    }
}