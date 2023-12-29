import java.util.Scanner;

public class CurrencyConverter2 {
    public static void main(String[] args) throws Exception {
        double money;
        String ourCurrency;
        String wantedCurrency;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        money = scanner.nextDouble();

        System.out.print("From: ");
        ourCurrency = scanner.next();
        System.out.print("To: ");
        wantedCurrency = scanner.next();

        double result = 0;
        if (!ourCurrency.equals("USD") && !ourCurrency.equals("EUR") && !ourCurrency.equals("BGN")) {
            System.out.print("Unknown conversion");
            return;
        }
        if (!wantedCurrency.equals("USD") && !wantedCurrency.equals("EUR") && !wantedCurrency.equals("BGN")) {
            System.out.print("Unknown conversion");
            return;
        }
        if (ourCurrency.equals("USD") && wantedCurrency.equals("BGN")) {
            result = money * 1.72;
        }
        if (ourCurrency.equals("BGN") && wantedCurrency.equals("USD")) {
            result = money / 1.72;
        }
        if (ourCurrency.equals("EUR") && wantedCurrency.equals("BGN")) {
            result = money * 1.9558;
        }
        if (ourCurrency.equals("BGN") && wantedCurrency.equals("EUR")) {
            result = money / 1.9558;
        }
        if (ourCurrency.equals(wantedCurrency)) {
            result = money;
        }
        System.out.println("Result: " + String.format("%.4f", result));
    }
}
