import java.util.Scanner;

public class SentenceCompare {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First sentence: ");
        String firstSentence = scanner.nextLine();
        System.out.print("Second sentence: ");
        String secondSentence = scanner.nextLine();
        System.out.print("Third sentence: ");
        String thirdSentence = scanner.nextLine();

        String[] firstWords = firstSentence.split(" ");
        String[] secondtWords = secondSentence.split(" ");
        String[] thirdWords = thirdSentence.split(" ");
        int matches = 0;

        for (int i = 0; i < firstWords.length; i++) {
            for (int j = 0; j < secondtWords.length; j++) {
                for (int j2 = 0; j2 < thirdWords.length; j2++) {
                    if (firstWords[i].equals(secondtWords[j]) && firstWords[i].equals(thirdWords[j2])) {
                        System.out.println("The word " + firstWords[i] + " is in all three sentences.");
                        matches++;
                    }
                }
            }
        }
        if (matches == 0) {
            System.out.println("No matches");
        }
    }
}
// My name is Peter
// Her name is Maria
// This is name of person