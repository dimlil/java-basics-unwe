import java.util.Scanner;
public class SumIfLarger {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int previous=0;
        while (true) {
            System.out.print("Next: ");
            int n = sc.nextInt();
            if (n > previous) {
                sum += n;
                previous = n;
            }else{
                break;
            }
        }
        System.out.println("Result: "+sum);
    }
}
