import java.util.Scanner;

public class QuadraticEquationsLoop {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Limit: ");
        int n = sc.nextInt();
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    double discriminant = (double) b * b - 4 * a * c;
                    if (discriminant < 0) {
                        System.out.println("No solution");
                    }
                    if (discriminant == 0) {
                        double solution = (double) -b / (2 * a);
                        System.out.println("x1= " + solution);
                    }
                    if (discriminant>0) {
                        double solution1 = (double) (-b + Math.sqrt(discriminant)) / (2 * a);
                        double solution2 = (double) (-b - Math.sqrt(discriminant)) / (2 * a);
                        System.out.println("x1= " + solution1);
                        System.out.println("x2= " + solution2);
                    }
                }
            }
        }
    }
}
