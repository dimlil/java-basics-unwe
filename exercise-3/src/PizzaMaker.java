import java.util.Scanner;

public class PizzaMaker {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pizza type: ");
        String pizzaType = scanner.next();
        System.out.print("Diameter: ");
        int diameter = scanner.nextInt();
        System.out.print("Thickness: ");
        double thickness = scanner.nextDouble();
        System.out.print("Select Topping 1: ");
        String topping1 = scanner.next();
        System.out.print("Select Topping 2: ");
        String topping2 = scanner.next();
        System.out.print("How many slices: ");
        int slices = scanner.nextInt();
        double volume = (double) (Math.PI * Math.pow(diameter / 2, 2) * thickness);
        System.out.println("You have ordered a " + diameter + " cm " + pizzaType + " pizza, " + thickness + " cm thickness, witch has " + topping1 + " and " + topping2 + ". It will be cut in " + slices + " slices.");
        System.out.println("The volume of the pizza with radius " + diameter / 2 + " cm and height " + thickness + " is " + String.format("%.2f", volume) +" cm3");
    }
}
