import java.util.Scanner;
public class EvenOrOddLoop {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start from: ");
        int start = scanner.nextInt();
        System.out.print("Up to: ");
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
