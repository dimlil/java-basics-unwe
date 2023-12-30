import java.util.Scanner;

public class ConeVolumeLoop {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Max Radius: ");
        int maxRadius = sc.nextInt();
        System.out.print("Max Height: ");
        int maxHeight = sc.nextInt();
        for (int i = 1; i <= maxRadius; i++) {
            for (int j = 1; j <= maxHeight; j++) {
                System.out.println("radius: " + i + " height: " + j);
                double volume = (double) Math.PI * Math.pow(i, 2) * j / 3;
                System.out.println("volume: " + String.format("%.2f", volume));
            }
        }
    }
}
