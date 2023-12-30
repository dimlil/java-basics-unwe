import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Word: ");
        String word = sc.nextLine();
        char[] wordAsArrayOfChars = word.toCharArray();
        for (int i = 0; i < wordAsArrayOfChars.length/2; i++) {
            char temp = wordAsArrayOfChars[i];
            wordAsArrayOfChars[i] = wordAsArrayOfChars[wordAsArrayOfChars.length - 1 - i];
            wordAsArrayOfChars[wordAsArrayOfChars.length - 1 - i] = temp;
        }
        for (int i = 0; i < wordAsArrayOfChars.length; i++) {
            System.out.print(wordAsArrayOfChars[i]);
        }
    }
}
