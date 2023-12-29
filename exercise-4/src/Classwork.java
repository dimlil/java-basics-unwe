import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) throws Exception {
        int year;
        int month;
        int day;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");
        year = scanner.nextInt();
        System.out.print("Month: ");
        month = scanner.nextInt();
        System.out.print("Day: ");
        day = scanner.nextInt();

        if (year >= 1900 && year <= 2019) {
            if (month < 1 || month > 12) {
                System.out.println("Invalid month");
                return;
            }
            if (day < 1 || day > 31) {
                System.out.println("Invalid day");
                return;
            }
            if(month == 11 || month == 12 || month == 1 || month == 2 || month == 3){
                System.out.println("Winter");
            }
            else if( month == 4 || month == 5){
                System.out.println("Spring");
            }
            else if(month == 6 || month == 7 || month == 8){
                System.out.println("Summer");
            }
            else if(month == 9 || month == 10){
                System.out.println("Autumn");
            }
            if (day == 1 && month == 6) {
                System.out.println("International Children’s Day");
            }
            if (day == 24 || day == 25 || day == 26 && month == 6) {
                System.out.println("Merry Christmas");
            }
        }
        else{
            System.out.println("Only years between 1900 and 2019");
        }
    }
}
