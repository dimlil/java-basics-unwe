import java.util.Scanner;

public class Century {
    public static void main(String[] args) throws Exception {
        int date;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Disided sum of two rolls: ");
        date = scanner.nextInt();

        if(date < 1900){
            System.out.println("Before 20th century");
        }
        if(date >= 2000){
            System.out.println("After 20th century");
        }
        if(date > 1900 && date <= 2000){
            System.out.println("During 20th century");
        }
    }
}
