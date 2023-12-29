import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Min: ");
        int start = scanner.nextInt();
        System.out.print("Max: ");
        int end = scanner.nextInt();
        int result = 1;
        for (int i = start; result*start <= end; i++) {
            result *= start;
            System.out.println(result);
        }
    }
}
