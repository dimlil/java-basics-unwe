import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your guesss: ");
        int guess = scanner.nextInt();

        Random random = new Random();
        int randomNum =random.nextInt(1,11);
        if (guess == randomNum) {
            System.out.println("Your guess is true - it was " + randomNum + "!");
        } else {
            System.out.println("Your guess is false - it was " + randomNum + "!");
        }
    }
}
