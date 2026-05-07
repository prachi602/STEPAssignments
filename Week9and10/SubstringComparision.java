import java.util.Scanner;
public class SubstringComparision {

    // Method to create substring using charAt()
    public static String SubstringUsingCharAt(String str, int start, int end) {
        String result = "";

        // Loop from start to end index (exclusive)
        for (int i = start; i < end; i++) {
            result += str.charAt(i); // add character one by one
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.next();

        // Input start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using charAt()
        String subCharAt = SubstringUsingCharAt(str, start, end);

        // Substring using built-in method
        String subBuiltIn = str.substring(start, end);

        // Compare both substrings
        boolean isSame = compareStrings(subCharAt, subBuiltIn);

        // Output results
        System.out.println("\nSubstring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);
        System.out.println("Are both substrings same? " + isSame);

        sc.close();
    }
}