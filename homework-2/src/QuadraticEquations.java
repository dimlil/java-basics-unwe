import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter C: ");
        int c = sc.nextInt();

        double x1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
