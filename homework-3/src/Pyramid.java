import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) throws Exception {
        int sideA;
        int sideB;
        int height;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side A: ");
        sideA = scanner.nextInt();
        System.out.print("Enter side b: ");
        sideB = scanner.nextInt();
        System.out.print("Enter height: ");
        height = scanner.nextInt();

        double volume = (double) (sideA * sideB * height) / 3;
        String volumeFormated = String.format("%." + 3 + "f", volume);
        System.out.println("The volume of a rectangular pyramid with sides " + sideA + " and " + sideB + " and height " + height + " is " + volumeFormated);
    }
}
