import java.util.Scanner;

public class DigitNames {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] numbersNames = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        System.out.print("Number: ");
        String num = scanner.nextLine();
        String[] digets = num.split("");
        for (int i = 0; i < digets.length; i++) {
            System.out.println(numbersNames[Integer.parseInt(digets[i])]);
        }

    }
}