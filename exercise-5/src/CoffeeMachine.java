import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) throws Exception {
        double amount;
        double price;
        int programm;
        String menu = "1. short espresso\t0.50\n2. long espresso\t0.60\n3. cappuccino\t\t0.85\n4. coffee with milk\t0.90\n5. caffeine- free\t0.60\n";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        amount = scanner.nextDouble();
        System.out.print(menu);
        programm = scanner.nextInt();
        switch (programm) {
            case 1:
                price = 0.50;
                break;
            case 2:
                price = 0.60;
                break;
            case 3:
                price = 0.85;
                break;
            case 4:
                price = 0.90;
                break;
            case 5:
                price = 0.60;
                break;
            default:
                System.out.println("Please select from the menu");
                return;
        }
        if (amount < price) {
            System.out.println("Not enough money");
            return;
        }
        if (amount == price) {
            System.out.println("Preparing your drink...");
            return;
        }
        if (amount > price) {
            System.out.println("Preparing your drink...");
            System.out.println("Change: " + String.format("%.2f", (amount - price)));
            return;
        }
    }
}
