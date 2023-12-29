import java.util.Scanner;

public class Counting {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("Enter 7 numbers");
        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeroes: " + zero);
    }
}
