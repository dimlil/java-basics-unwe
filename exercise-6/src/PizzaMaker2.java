import java.util.Scanner;

public class PizzaMaker2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double price = 5;
        System.out.print("What type of pizza do you want? ");
        String pizzaType = s.next();

        if (!pizzaType.equalsIgnoreCase("Pepperoni") && !pizzaType.equalsIgnoreCase("Siciliana")) {
            System.out.println("We cannot cook such pizza");
            return;
        }

        System.out.print("Diameter: ");
        int diameter = s.nextInt();
        if (diameter < 12 || diameter > 36) {
            System.out.println("We only make pizzas between 12 and 36 cm");
            return;
        }
        price += diameter / 12.0;

        System.out.print("Thickness: ");
        float thickness = s.nextFloat();
        if (thickness < 1) {
            System.out.println("The pizza is too thin");
            return;
        } else if (thickness > 4) {
            System.out.println("The pizza is too thick");
            return;
        }
        price += thickness / 2;

        System.out.print("Select topping #1: ");
        String topping1 = s.next();
        switch (topping1) {
            case "ketchup":
                price += 0.20;
                break;
            case "mustard":
                price += 0.23;
                break;
            default:
                price += 0.27;
                break;
        }

        System.out.print("Select topping #2: ");
        String topping2 = s.next();
        switch (topping2) {
            case "ketchup":
                price += 0.20;
                break;
            case "mustard":
                price += 0.23;
                break;
            default:
                price += 0.27;
                break;
        }

        System.out.print("How many slices? ");
        int slices = s.nextInt();
        if (slices < 0) {
            System.out.println("No way to slice the pizza");
            return;
        } else if (slices == 0) {
            System.out.println("We will not slice the pizza");
        } else if (slices > 16) {
            System.out.println("We cannot make more than 16 slices");
            return;
        }

        System.out.printf(
                "You have ordered a %d cm %s pizza, %.1f cm thick, which has %s and %s. It will be cut in %d slices\n",
                diameter, pizzaType, thickness, topping1, topping2, slices);
        System.out.printf("The final price is: %.2f\n", price);

    }
}