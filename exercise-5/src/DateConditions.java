import java.util.Scanner;

public class DateConditions {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Day: ");
        int day = scanner.nextInt();

        if (year < 1900 || year > 2019) {
            System.out.println("Only years between 1900 and 2019");
            return;
        }
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            return;
        }
        if (day < 1 || day > 31) {
            System.out.println("Invalid day");
            return;
        }

        if (month <= 3 || month >= 11) {
            System.out.println("Winter");
        }
        if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        }
        if (month == 4 || month == 5) {
            System.out.println("Spring");
        }
        if (month == 9 || month == 10) {
            System.out.println("Authumn");
        }
        if (day == 1 && month == 6) {
            System.out.println("International Child            System.out.println(\"International Children's Day\");\n" + //
                    "ren's Day");
        }
        if (day == 24 || day == 25 || day == 26 && month == 12) {
            System.out.println("Merry Christmas");
        }

    }
}
