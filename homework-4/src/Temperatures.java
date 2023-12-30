import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) throws Exception {
        double temperature; 
        int unit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature: ");
        temperature = scanner.nextDouble();
        System.out.print("Unit: ");
        unit = scanner.nextInt();


        if (unit < 1) {
            System.out.println("Unsupported unit");
            return;
        }
        if (unit > 3) {
            System.out.println("Unsupported unit");
            return;
        }

        switch (unit) {
            case 1:
                double CelsiusFahrenheit = temperature * 9 / 5 + 32;
                double CelsiusKelvin = temperature + 273.15;
                System.out.println("Fahrenheit: " + String.format("%.2f", CelsiusFahrenheit));
                System.out.println("Kelvin: " + String.format("%.2f", CelsiusKelvin));
                break;
        
            case 2:
                double FahrenheitCelsius = (temperature - 32) * 5 / 9;
                double FahrenheitKelvin = (temperature - 32) * 5 / 9 + 273.15;
                System.out.println("Celsius: " + String.format("%.2f", FahrenheitCelsius));
                System.out.println("Kelvin: " + String.format("%.2f", FahrenheitKelvin));
                break;
        
            case 3:
                double KelvinCelsius = temperature - 273.15;
                double KelvinFahrenheit = (temperature - 273.15) * 9 / 5 + 32;
                System.out.println("Celsius: " + String.format("%.2f", KelvinCelsius));
                System.out.println("Fahrenheit: " + String.format("%.2f", KelvinFahrenheit));
                break;
        
            default:
                break;
        }
    }
}
