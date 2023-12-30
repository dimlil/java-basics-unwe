import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) throws Exception {
        int program;
        int temperature = 0; 
        int duration = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a programme: ");
        program = scanner.nextInt();
        if (program < 1) {
            System.out.println("No such programme");
            return;
        }
        if (program > 5) {
            System.out.println("No such programme");
            return;
        }

        switch (program) {
            case 1:
                temperature = 60;
                duration = 125;
                break;
        
            case 2:
                temperature = 90;
                duration = 106;
                break;
            case 3:
                temperature = 40;
                duration = 98;
                break;
            case 4:
                temperature = 50;
                duration = 65;
                break;
            case 5:
                System.out.print("Desired temperature: ");
                temperature = scanner.nextInt();
                System.out.print("Desired time: ");
                duration = scanner.nextInt();
                break;
        
            default:
                break;
        }

        System.out.println("Temperature " + temperature + " degrees, Time " + duration + " minutes");
    }
}
