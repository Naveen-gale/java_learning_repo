import java.util.Scanner;

public class WordAndNonAlphabetCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = sc.nextLine();

        String trimmed = message.trim();
        int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
        int nonAlphabetical = 0;

        for (int i = 0; i < message.length(); i++) {
            if (!Character.isLetter(message.charAt(i))) {
                nonAlphabetical++;
            }
        }

        System.out.println("Number of words: " + words);
        System.out.println("Non-alphabetical characters: " + nonAlphabetical);
        sc.close();
    }
}
