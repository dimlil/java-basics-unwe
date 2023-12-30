import java.util.Scanner;

public class Capital {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days? ");
        int days = sc.nextInt();
        double[] prices = new double[days];
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }
        System.out.println("Price movements:");
        for (int i = 1; i < prices.length; i++) {
            double change = (double) prices[i] - prices[i - 1];
            if (change > 0) {
                System.out.println("UP with " + String.format("%.4f", change));
            }
            if (change < 0) {
                change *= -1;
                System.out.println("DOWN with " + String.format("%.4f", change));
            }
            if (change == 0) {
                System.out.println("Not changed");
            }
        }
        double average = 0;
        for (int i = 0; i < prices.length; i++) {
            average += (double) prices[i];
        }
        average = (double) average / prices.length;
        System.out.println("Average price for the period: " + String.format("%.4f", average));
    }
}
