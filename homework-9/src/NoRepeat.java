import java.util.Arrays;
import java.util.Scanner;

public class NoRepeat {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[1];
        int wordsIndex = 0;
        while (true) {
            System.out.print("Word: ");
            String word = scanner.nextLine();
            if (word.equals(".")) {
                break;
            }
            boolean found = false;
            for (int i = 0; i < wordsIndex; i++) {
                if (words[i].equals(word)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("This word already exists!");
            } else {
                words[wordsIndex] = word;
                wordsIndex++;
                words = Arrays.copyOf(words, wordsIndex + 1);
            }
        }
        System.out.println("All words: ");
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                System.out.println(words[i]);
            }
        }
    }
}