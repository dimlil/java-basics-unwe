import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start from: ");
        int start = scanner.nextInt();
        System.out.print("Up to: ");
        int end = scanner.nextInt();
        int result = 1;

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                result *= j;
            }
            System.out.println(i + "! = " + result);
            result = 1;
        }
    }
}
