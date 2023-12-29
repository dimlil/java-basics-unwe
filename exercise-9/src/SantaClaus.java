import java.util.ArrayList;
import java.util.Scanner;

public class SantaClaus {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many gifts do you want: ");
        int wantedGiftsNum = scanner.nextInt();
        if (wantedGiftsNum < 1 || wantedGiftsNum > 10) {
            System.out.println("You are allowed between 1 and 10 gifts.");
            return;
        }
        String[] wantedGiftsArr = new String[wantedGiftsNum];
        for (int i = 0; i < wantedGiftsNum; i++) {
            System.out.print("I want: ");
            wantedGiftsArr[i] = scanner.next();
        }
        System.out.print("How many gifts does Santa Calus have: ");
        int santaGiftsNum = scanner.nextInt();
        String[] santaGiftsArr = new String[santaGiftsNum];
        if (santaGiftsNum < 3) {
            System.out.println("Santa should have at least 3 gifts.");
            return;
        }
        if (santaGiftsNum < 0 || santaGiftsNum > 10) {
            System.out.println("You are allowed between 1 and 10 gifts.");
            return;
        }
        for (int i = 0; i < santaGiftsNum; i++) {
            System.out.print("Santa Claus has: ");
            santaGiftsArr[i] = scanner.next();
        }
        
        // String[] result = new String[wantedGiftsNum];
        ArrayList<String> result=new ArrayList<>();
        for (int i = 0; i < wantedGiftsNum; i++) {
            for (int j = 0; j < santaGiftsNum; j++) {
                if (wantedGiftsArr[i].equals(santaGiftsArr[j])) {
                    result.add(wantedGiftsArr[i]);
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println("You will receive: " + result.get(i));
        }
    }
}
