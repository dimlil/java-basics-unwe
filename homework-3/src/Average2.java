import java.util.InputMismatchException;
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter First Number: ");
                firstNumber = scanner.nextInt();
                if (firstNumber <= 127) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("You did not enter a Integer.");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Enter Second Number: ");
                secondNumber = scanner.nextInt();
                if (secondNumber <= 127) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("You did not enter a Integer.");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Enter Third Number: ");
                thirdNumber = scanner.nextInt();
                if (thirdNumber <= 127) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("You did not enter a Integer.");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Enter Fourth Number: ");
                fourthNumber = scanner.nextInt();
                if (fourthNumber <= 127) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("You did not enter a Integer.");
                scanner.nextLine();
            }
        }

        double average = (double) (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4;
        String averageFormated = String.format("%.2f", average);
        
        System.out.println("The average, calculated with whole number division is " + (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4);
        System.out.println("The average, calculated with decimal number division is " + averageFormated);
    }
}
