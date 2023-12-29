import java.util.Scanner;

public class WorldMap {
    public static void main(String[] args) throws Exception {
        double latitude1;
        double longitude1;
        double latitude2;
        double longitude2;
        String navigation = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Latitude 1: ");
        latitude1 = scanner.nextDouble();
        System.out.print("longitude 1: ");
        longitude1 = scanner.nextDouble();

        System.out.print("Latitude 2: ");
        latitude2 = scanner.nextDouble();
        System.out.print("longitude 2: ");
        longitude2 = scanner.nextDouble();

        if (latitude1 == latitude2 && longitude1 == longitude2) {
            System.out.println("This is the same place");
            return;
        }
        if (latitude1 > latitude2 && longitude1 == longitude2) {
            navigation = "SOUTH";
        }
        if (latitude1 < latitude2 && longitude1 == longitude2) {
            navigation = "NORTH";
        }
        if (latitude1 == latitude2 && longitude1 > longitude2) {
            navigation = "WEST";
        }
        if (latitude1 == latitude2 && longitude1 < longitude2) {
            navigation = "EAST";
        }

        if (latitude1 > latitude2 && longitude1 > longitude2) {
            navigation = "SOUTHWEST";
        }
        if (latitude1 < latitude2 && longitude1 > longitude2) {
            navigation = "NORTHWEST";
        }

        if (latitude1 > latitude2 && longitude1 < longitude2) {
            navigation = "SOUTHEAST";
        }
        if (latitude1 < latitude2 && longitude1 < longitude2) {
            navigation = "NORTHEAST";
        }

        System.out.println("GPS 1: " + String.format("%.4f", latitude1) + " " + String.format("%.4f", longitude1));
        System.out.println("GPS 2: " + String.format("%.4f", latitude2) + " " + String.format("%.4f", longitude2));
        System.out.println(navigation);
    }
}
