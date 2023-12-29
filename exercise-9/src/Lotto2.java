import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
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
                boolean isExist = false;
                for (int j = 0; j < i; j++) {
                    if (myNumbers[j] == num) {
                        isExist = true;
                    }
                }
                if (isExist == true) {
                    System.out.println(num + "already exists, try again!");
                } else {
                    i++;
                }
            } else {
                System.out.println("Only between 1 and 47");
            }
        }
        for (int j = 0; j < generatedNumbers.length; j++) {
            Random random = new Random();
            int randomNumber = random.nextInt(47) + 1;

            boolean isExist = false;

            for (int k = 0; k < i; k++) {

                if (myNumbers[k] == randomNumber) {
                    isExist = true;
                }
            }
            if (isExist == true) {
                j--;
            } else {
                generatedNumbers[j] = randomNumber;
            }
        }
        for (int j = 0; j < myNumbers.length; j++) {
            for (int k = 0; k < generatedNumbers.length; k++) {
                if (myNumbers[j] == generatedNumbers[k]) {
                    gessedNumbers++;
                }
            }
        }
        String result = "";
        for (int j = 0; j < generatedNumbers.length; j++) {
            result += generatedNumbers[j] + "\t";
        }
        System.out.println("Lotto numbers:");
        System.out.println(result);
        System.out.println("You guessed " + gessedNumbers + " numbers");
    }
}
