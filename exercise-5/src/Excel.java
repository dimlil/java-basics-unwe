import java.util.Scanner;

public class Excel {
    public static void main(String[] args) throws Exception {
        double x;
        double y;
        double z;
        String function;

        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        x = scanner.nextDouble();
        System.out.print("y: ");
        y = scanner.nextDouble();
        System.out.print("z: ");
        z = scanner.nextDouble();

        System.out.print("Function: ");
        function = scanner.next();

        switch (function) {
            case "SUM":
                System.out.println("Result: " + String.format("%.4f", (x + y + z)));
                break;
            case "AVERAGE":
                System.out.println("Result: " + String.format("%.4f", ((x + y + z) / 3)));
                break;
            case "MIN":
                double min = Math.min(x, y);
                if (min > z) {
                    min = z;
                }
                System.out.println("Result: " + String.format("%.4f", min));
                break;
            case "MAX":
                double max = Math.max(x, y);
                if (max < z) {
                    max = z;
                }
                System.out.println("Result: " + String.format("%.4f", max));
                break;

            default:
                System.out.println("Unsupported function");
                break;
        }
    }
}
