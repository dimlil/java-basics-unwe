import java.util.Scanner;
public class Sphere {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The diemeter of the sphere: ");
        double diameter = scanner.nextDouble();
        double v = (double) 4 / 3 * Math.PI * Math.pow(diameter / 2, 3);
        double s = 4 * Math.PI * Math.pow(diameter / 2, 2);
        System.out.println("The volume of a sphere with diameter" + diameter + "is: " + String.format("%.4f", v));   
        System.out.println("The surface area is " +String.format("%.4f", s));
    }
}
