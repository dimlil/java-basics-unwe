import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}
