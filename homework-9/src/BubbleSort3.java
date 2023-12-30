import java.util.Scanner;

public class BubbleSort3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
// The weather is quite cold this winter