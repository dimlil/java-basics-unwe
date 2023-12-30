import java.util.InputMismatchException;
import java.util.Scanner;

public class DiceRoll2 {
    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args) throws Exception {
        int desidedNumber;
        int firstDice;
        int secondDice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Disided sum of two rolls: ");
        desidedNumber = scanner.nextInt();
        if (desidedNumber < 2) {
            System.out.println("The sum of two rolls cannot be less than 2");
            return;
        }
        if (desidedNumber > 12) {
            System.out.println("The sum of two rolls cannot be greater than 12");
            return;
        }

        firstDice = getRandomNumber(1, 6);
        secondDice = getRandomNumber(1, 6);
        System.out.println("First roll was " + firstDice + ", second roll was " + secondDice + ", the sum is "
                + (firstDice + secondDice));
        if (firstDice + secondDice == desidedNumber) {
            System.out.println("Win: true");
        } else {
            System.out.println("Win: false");
        }
    }
}
