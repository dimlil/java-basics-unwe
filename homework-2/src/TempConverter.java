public class TempConverter {
    public static void main(String[] args) throws Exception {
        double fahrenheit = 98.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        System.out.println("Temperature in Celsius is: " + celsius);
    }
}
