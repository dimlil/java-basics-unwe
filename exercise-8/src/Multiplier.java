import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Size: ");
        n = sc.nextInt();

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("first - " + i + ": ");
            firstArr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("second - " + i + ": ");
            secondArr[i] = sc.nextInt();
        }
        for (int i = 0; i < secondArr.length; i++) {
            double result = firstArr[i] * secondArr[i];
            System.out.println(String.format("%.2f", result));
        }
    }
}
