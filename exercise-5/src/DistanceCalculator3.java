import java.util.Scanner;

public class DistanceCalculator3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Speed (in km/h): ");
        int speed = scanner.nextInt();
        if (speed <= 0) {
            System.out.println("Invalid speed");
            return;
        }
        if (speed > 100) {
            System.out.println("You're driving fast!");
        }
        if (speed > 140) {
            System.out.println("You're driving too fast! Please slow down.");
        }
        System.out.print("Duration (in hours): ");
        double duration = scanner.nextDouble();
        if (duration <= 0) {
            System.out.println("Invalid duration");
            return;
        }
        if (duration > 4) {
            System.out.println("You need some rest!");
        }
        double distance = (double) speed * duration;
        System.out.println("Distance: " + String.format("%.2f", distance));
    }
}
