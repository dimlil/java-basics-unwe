import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        double firstNumber;
        double secontNumber;
        String operator;

        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Second Number: ");
        secontNumber = scanner.nextDouble();
        System.out.print("Operator: ");
        operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstNumber + secontNumber));
                break;
            case "-":
                System.out.println("Result: " + (firstNumber - secontNumber));
                break;
            case "*":
                System.out.println("Result: " + (firstNumber * secontNumber));
                break;
            case "/":
                if (secontNumber == 0) {
                    System.out.println("Cannot divide by zero");
                }
                else{
                    System.out.println("Result: " + (firstNumber / secontNumber));
                }
                break;
            case "AVG":
                System.out.println("Result: " + ((firstNumber + secontNumber)/2));
                break;
            case "%":
                System.out.println("Result: " + (firstNumber % secontNumber));
                break;
            default:
                System.out.println("This operator is not supported");
        }
    }
}
