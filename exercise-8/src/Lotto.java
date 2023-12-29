import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int gessedNumbers = 0;
        int[] generatedNumbers = new int[6];
        int[] myNumbers = new int[6];
        System.out.println("Enter 6 numbers");
        while (i < 6) {
            int num = sc.nextInt();
            if (num >= 1 && num <= 47) {
                myNumbers[i] = num;
                i++;
            } else {
                System.out.println("Only between 1 and 47");
            }
        }
        for (int j = 0; j < generatedNumbers.length; j++) {
            Random random = new Random();
            int randomNumber = random.nextInt(47) + 1;
            generatedNumbers[j] = randomNumber;
        }
        for (int j = 0; j < myNumbers.length; j++) {
            for (int k = 0; k < generatedNumbers.length; k++) {
                if (myNumbers[j] == generatedNumbers[k]) {
                    gessedNumbers++;
                }
            }
        }
        String result="";
        for (int j = 0; j < generatedNumbers.length; j++) {
            result+=generatedNumbers[j] + "\t";
        }
        System.out.println("Lotto numbers:");
        System.out.println(result);
        System.out.println("You guessed " + gessedNumbers + " numbers");
    }
}
