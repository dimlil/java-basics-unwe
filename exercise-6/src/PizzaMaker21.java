import java.util.Scanner;

public class PizzaMaker21 {
    public static void main(String[] args) throws Exception {
        int diameter = 0;
        int thickness = 0;
        int slices = 0;
        String pizzaType;
        String topic1;
        String topic2;
        double price = 5.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What type of pizza do you want: ");
        pizzaType = scanner.next();
        if (!pizzaType.toLowerCase().equals("pepperoni") && !pizzaType.toLowerCase().equals("siciliana")) {
            System.out.print("We cannot cook such pizza");
            return;
        }
        System.out.print("How large(diameter, in cm): ");
        diameter = scanner.nextInt();
        if (diameter < 12 && diameter > 36) {
            System.out.print("We only make pizzas between 12 and 36 cm!");
            return;
        }
        price += (double) diameter/12;

        System.out.print("How thick(in cm): ");
        thickness = scanner.nextInt();
        if (thickness < 1) {
            System.out.print("The pizza is too thin!");
            return;
        }
        if (thickness > 4) {
            System.out.print("The pizza is too thick!");
            return;
        }
        price += (double) thickness/2;

        System.out.print("Select topping #1: ");
        topic1 = scanner.next();
        if (topic1.equals("mustard")) {
            price += (double) 0.23;
        } else if (topic1.equals("ketchup")) {
            price += (double) 0.20;
        } else {
            price += (double) 0.27;
        }

        System.out.print("Select topping #2: ");
        topic2 = scanner.next();
        if (topic2.equals("mustard")) {
            price += (double) 0.23;
        } else if (topic2.equals("ketchup")) {
            price += (double) 0.20;
        } else {
            price += (double) 0.27;
        }

        System.out.print("How many slices? ");
        slices = scanner.nextInt();
        if (slices < 0) {
            System.out.print("No way to slice the pizza!");
            return;
        }
        if (slices == 0) {
            System.out.print("We will not slice the pizza.");
        }
        if (slices > 16) {
            System.out.print("We cannot make more than 16 slices!");
            return;
        }
        
        System.out.println("You have ordered a " + diameter + " cm " + pizzaType + " pizza, " + thickness + " cm thick which has " + topic1 + " and " + topic2 + ". It will be cut in " + slices + " slices.");
        System.out.println("The final price is: " + String.format("%.2f", price));
    }
}
