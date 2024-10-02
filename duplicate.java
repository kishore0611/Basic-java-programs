import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class DuplicateChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Enter a list of integers:");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (numbers.contains(number)) {
                    throw new DuplicateNumberException("Duplicate number found: " + number);
                } else {
                    numbers.add(number);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            } catch (DuplicateNumberException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        scanner.close();
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

