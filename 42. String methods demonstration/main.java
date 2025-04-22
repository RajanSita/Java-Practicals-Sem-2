public class main {
    public static void main(String[] args) {
        String str1 = "  Hello World  ";
        String str2 = "hello world";

        System.out.println("Original String: '" + str1 + "'");

        // Demonstrating trim()
        String trimmedStr = str1.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");

        // Demonstrating length()
        int length = trimmedStr.length();
        System.out.println("Length of trimmed string: " + length);

        // Demonstrating equals()
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual);

        // Demonstrating compareTo()
        int compareResult = str1.compareTo(str2);
        System.out.println("Comparison result of str1 and str2: " + compareResult);

        // Demonstrating substring()
        String substring = str1.substring(2, 7);
        System.out.println("Substring from index 2 to 7: '" + substring + "'");

        // Demonstrating equalsIgnoreCase()
        boolean isEqualIgnoreCase = str1.trim().equalsIgnoreCase(str2.trim());
        System.out.println("trimmed str1 equalsIgnoreCase trimmed str2: " + isEqualIgnoreCase);
    }
}
