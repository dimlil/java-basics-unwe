import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many seconds? ");
        int seconds = scanner.nextInt();
        double minutes = (double) seconds / 60;
        System.out.println("Minutes: " + minutes);
        double hours = (double) minutes / 60;
        System.out.println("Hours: " + hours);
        double days = (double) hours / 24;
        System.out.println("Days: " + days);
        double weeks = (double) days / 7;
        System.out.println("Weeks: " + weeks);
        double years = (double) days / 365;
        System.out.println("Years: " + years);
    }
}
