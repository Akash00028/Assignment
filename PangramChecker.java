import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String input) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        Set<Character> uniqueCharacters = new HashSet<>();

        for (char ch : cleanedInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                uniqueCharacters.add(ch);
            }
        }

        return uniqueCharacters.size() == 26;
    }
}