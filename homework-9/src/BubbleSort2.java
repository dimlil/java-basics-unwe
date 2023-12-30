import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Word: ");
        String word = sc.nextLine();
        char[] wordAsArrayOfChars = word.toCharArray();
        for (int i = 0; i < wordAsArrayOfChars.length - 1; i++) {
            int ascii = (int) wordAsArrayOfChars[i];
            for (int j = 1; j < wordAsArrayOfChars.length; j++) {
                int asciiNext = (int) wordAsArrayOfChars[j];
                if (ascii>asciiNext) {
                    char temp = wordAsArrayOfChars[i];
                    wordAsArrayOfChars[i] = wordAsArrayOfChars[j];
                    wordAsArrayOfChars[j] = temp;
                }
            }
        }
        // Arrays.sort(wordAsArrayOfChars);
        for (int i = 0; i < wordAsArrayOfChars.length; i++) {
            System.out.print(wordAsArrayOfChars[i]);
        }
    }
}
