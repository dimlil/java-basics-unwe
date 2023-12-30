import java.util.Scanner;

public class CoffeeMachine2 {
    static Scanner scanner = new Scanner(System.in);
    static String[] coffiesNames = {
            "short coffee",
            "long coffee",
            "mochaccino",
            "cappuccino",
            "green tea",
            "earl grey"
    };
    static double[] prices = {
            0.70,
            0.90,
            1.30,
            1.20,
            0.80,
            0.85
    };
    static double[] allowedCoins = { 0, 0.05, 0.10, 0.20, 0.50, 1, 2 };
    static double coinsSum = 0;
    static int selectedItemNum;
    static int sugar;

    static String menu = "============ MENU ============\n1: short coffie\t\t0.70\n2: long coffie\t\t0.90\n3: mochaccino\t\t1.30\n4: cappuccino\t\t1.20\n5: green tea\t\t0.80\n6: earl grey\t\t0.85\n";

    static void showMenu() throws InterruptedException {
        System.out.println(menu);
        coinsColect();
    }

    static void coinsColect() throws InterruptedException {
        coinsSum = 0;
        System.out.print("Put coins into the machine: ");
        while (true) {
            double coin = scanner.nextDouble();
            if (coin < 0) {
                return;
            }
            if (coin == 0) {
                break;
            }
            boolean isExist = false;
            for (int i = 0; i < allowedCoins.length; i++) {
                if (allowedCoins[i] == coin) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                coinsSum += (double) coin;
            } else {
                System.out.println("No such coin.");
            }
        }
        selectItem();
    }

    static void selectItem() throws InterruptedException {
        System.out.print("Choose an item: ");
        selectedItemNum = scanner.nextInt();
        if (selectedItemNum < 1 || selectedItemNum > 6) {
            System.out.println("Please select between 1 and 6.");
            showMenu();
        } else {
            selectSugar();
        }
    }

    static void selectSugar() throws InterruptedException {
        System.out.print("Sugar amount (0-5): ");
        sugar = scanner.nextInt();
        if (sugar < 0 || sugar > 5) {
            System.out.println("Sugar amount can be between 0 and 5.");
            showMenu();
        }
        else {
            checkSum();
        }
    }

    static void checkSum() throws InterruptedException {
        if (coinsSum < prices[selectedItemNum - 1]) {
            System.out.println("You don't have enough money (" + String.format("%.2f", coinsSum) +"), the price is " + String.format("%.2f", prices[selectedItemNum - 1]) +".");
            showMenu();
        }
        if (coinsSum > prices[selectedItemNum - 1]) {
            double change = (double) coinsSum - prices[selectedItemNum - 1];
            System.out.println("Your change: " + String.format("%.2f", change));
            System.out.println("Preparing " + coffiesNames[selectedItemNum - 1] + " with " + sugar + " sugar for "+ String.format("%.2f", prices[selectedItemNum - 1]) +" leva.");
            Thread.sleep(3000);
            System.out.println("Your drink is ready!");
            showMenu();
        }
    }

    public static void main(String[] args) throws Exception {
        showMenu();
    }
}
