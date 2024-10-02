import java.util.*;
class VowelChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        try {
            checkVowels(input);
            System.out.println("String contains vowels.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    // Method to check if the string contains any vowels
    public static void checkVowels(String str) throws Exception {
        String vowels = "aeiouAEIOU";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                return;
            }
        }
        throw new Exception("Error: String does not contain any vowels");
    }
}
