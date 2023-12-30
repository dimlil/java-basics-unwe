import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Original order:\n" + sentence);
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        String reversedSentence = String.join(" ", words) ;
        System.out.println("Reversed sentence:\n" + reversedSentence);

    }
}
// The weather is quite cold this winter