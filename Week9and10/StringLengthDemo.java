import java.util.Scanner;
public class StringLengthDemo {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0; // Counter to store length

        try {
            // Infinite loop to access characters
            while (true) {
                str.charAt(count); // Access character at index
                count++;           // Increment count
            }
        } 
        catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index goes out of range
            return count; // Return total characters counted
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input using next()
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Calling user-defined method
        int result1 = findLength(input);

        // Using built-in method for comparison
        int result2 = input.length();

        // Displaying results
        System.out.println("Length without length(): " + result1);
        System.out.println("Length using length(): " + result2);
    }
}
