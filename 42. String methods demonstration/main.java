import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("String Methods Demonstration");
        System.out.println("===========================");
        
        // Taking two strings as input
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        // equals() method demonstration
        System.out.println("\n1. equals() Method:");
        System.out.println("Checking if strings are equal:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        
        // Case-insensitive comparison
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        
        // trim() method demonstration
        System.out.println("\n2. trim() Method:");
        System.out.print("Enter a string with leading/trailing spaces: ");
        String strWithSpaces = scanner.nextLine();
        
        System.out.println("Original string: '" + strWithSpaces + "'");
        System.out.println("After trim(): '" + strWithSpaces.trim() + "'");
        
        // length() method demonstration
        System.out.println("\n3. length() Method:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());
        System.out.println("Length of trimmed string: " + strWithSpaces.trim().length());
        
        // substring() method demonstration
        System.out.println("\n4. substring() Method:");
        if (str1.length() > 2) {
            System.out.println("str1.substring(2): " + str1.substring(2));
            
            int endIndex = Math.min(5, str1.length());
            System.out.println("str1.substring(0, " + endIndex + "): " + str1.substring(0, endIndex));
        } else {
            System.out.println("String too short for substring demonstration");
        }
        
        // compareTo() method demonstration
        System.out.println("\n5. compareTo() Method:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        
        if (str1.compareTo(str2) < 0) {
            System.out.println("str1 comes before str2 lexicographically");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("str1 comes after str2 lexicographically");
        } else {
            System.out.println("str1 and str2 are lexicographically equal");
        }
        
        // Case-insensitive comparison
        System.out.println("str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2));
        
        System.out.println("\nAdditional String methods:");
        
        // Check if string contains a sequence
        System.out.print("Enter a substring to search in str1: ");
        String searchStr = scanner.nextLine();
        System.out.println("str1.contains(\"" + searchStr + "\"): " + str1.contains(searchStr));
        
        // Convert to upper and lower case
        System.out.println("str1.toUpperCase(): " + str1.toUpperCase());
        System.out.println("str1.toLowerCase(): " + str1.toLowerCase());
        
        scanner.close();
    }
}