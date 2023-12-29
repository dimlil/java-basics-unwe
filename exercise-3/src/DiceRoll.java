import java.util.InputMismatchException;
import java.util.Scanner;

public class DiceRoll {
    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args) throws Exception {
        int desidedNumber;
        int firstDice;
        int secondDice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Disided sum of two rolls: ");
                desidedNumber = scanner.nextInt();
                if (desidedNumber >= 2 && desidedNumber <= 12) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("You did not enter a Integer.");
                scanner.nextLine(); // needed to clear buffer
            }
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
