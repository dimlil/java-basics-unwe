import java.util.Scanner;
public class Factorial1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Factorial of: ");
        int inputNum = scanner.nextInt();
        int result = 1;
        for(int i=1; i<=inputNum; i++){
            result *= i;
        }
        System.out.println(inputNum + "! = " + result);
    }
}
