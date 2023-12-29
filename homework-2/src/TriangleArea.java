import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter A: ");
        int a = scanner.nextInt();
        System.out.print("Please enter C (hypotenuse): ");
        int c = scanner.nextInt();
        double b = Math.sqrt(c * c - a * a);
        double s = (a * b) / 2;
        System.out.println("The area of the triangle is " + String.format("%.3f", s));
    }
}
