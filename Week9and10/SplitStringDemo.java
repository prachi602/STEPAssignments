import java.util.Scanner;

public class SplitStringDemo {

    // Method to count number of words
    public static int countWords(String str) {
        int count = 1; // Minimum one word

        // Loop through string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++; // Increase count for each space
            }
        }
        return count;
    }

    // Method to split string manually
    public static String[] splitText(String str) {

        int words = countWords(str);
        String[] arr = new String[words]; // Array to store words

        int start = 0;  // Starting index of word
        int index = 0;  // Array index

        // Traverse string
        for (int i = 0; i < str.length(); i++) {

            // When space is found
            if (str.charAt(i) == ' ') {
                arr[index] = str.substring(start, i); // Extract word
                index++;
                start = i + 1; // Move to next word
            }
        }

        // Store last word
        arr[index] = str.substring(start);

        return arr;
    }

    // Method to compare two arrays
    public static boolean compare(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input using nextLine()
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Custom split method
        String[] custom = splitText(input);

        // Built-in split method
        String[] builtin = input.split(" ");

        // Display custom output
        System.out.println("\nCustom Split Output:");
        for (String word : custom) {
            System.out.println(word);
        }

        // Display built-in output
        System.out.println("\nBuilt-in Split Output:");
        for (String word : builtin) {
            System.out.println(word);
        }

        // Compare results
        boolean result = compare(custom, builtin);

        System.out.println("\nAre both results same? " + result);
    }
}