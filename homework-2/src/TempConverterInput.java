import java.util.Scanner;
public class TempConverterInput {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the temperature in Fahrenheit? ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Fahrenheit is: " + String.format("%.1f", fahrenheit));
        System.out.println("Temperature in Celsius is: " + String.format("%.2f", celsius));
    }
}
