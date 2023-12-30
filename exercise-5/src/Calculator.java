import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Operation: ");
        String operation = scanner.next();
        double result = 0;
        if (operation.equals("+")) {
            result = num1 + num2;
        }
        if (operation.equals("-")) {
            result = num1 - num2;
        }
        if (operation.equals("*")) {
            result = num1 * num2;
        }
        if (operation.equals("/")) {
            if (num2 == 0) {
                System.out.println("Division by zero is not allowed");
                return;
            } else {
                result = num1 / num2;
            }
        }
        if (operation.equals("%")) {
            if (num2 == 0) {
                System.out.println("Division by zero is not allowed");
                return;
            } else {
                result = num1 % num2;
            }
        }
        if (operation.equals("AVG")) {
            result = (num1 + num2) / 2;
        }
        System.out.println(result);
    }
}
