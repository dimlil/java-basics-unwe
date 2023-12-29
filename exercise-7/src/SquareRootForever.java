import java.util.Scanner;
public class SquareRootForever {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        String command = "";
        while (!command.equals("exit")) {
            System.out.print("Number: ");
            number = scanner.nextInt();
            double result = (double) Math.sqrt(number);
            System.out.println("Square root " + String.format("%.2f", result));
            System.out.print("Command: ");
            command = scanner.next();
        }
    }
}
