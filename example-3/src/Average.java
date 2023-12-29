import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        long firstNumber;
        long secontNumber;
        long thirdNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        firstNumber = scanner.nextLong();
        System.out.print("Enter Second Number: ");
        secontNumber = scanner.nextLong();
        System.out.print("Enter Third Number: ");
        thirdNumber = scanner.nextLong();
        
        double average = (double) (firstNumber + secontNumber + thirdNumber) / 3;

        System.out.print("The average is: " + String.format("%,.4f",average));
    }
}
