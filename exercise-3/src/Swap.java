import java.util.Scanner;
public class Swap {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        System.out.println("x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);
    }
}
