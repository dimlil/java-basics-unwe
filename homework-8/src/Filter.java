import java.util.Scanner;

public class Filter {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        System.out.println("Please enter" + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }
        System.out.println("Operation (>, < or =): ");
        String operator = sc.next();
        System.out.print("Than: ");
        double filterNum = sc.nextDouble();
        for (int i = 0; i < numbers.length; i++) {
            if (operator.equals(">")) {
                if (numbers[i] > filterNum) {
                    System.out.println(numbers[i]);
                }
            } else if (operator.equals("<")) {
                if (numbers[i] < filterNum) {
                    System.out.println(numbers[i]);
                }
            } else if (operator.equals("=")) {
                if (numbers[i] == filterNum) {
                    System.out.println(numbers[i]);
                }

            }
        }
    }
}
