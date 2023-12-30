import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Limit: ");
        int n = sc.nextInt();
        int previous = 0, next = 1, n3, i;
        System.out.println(previous);
        System.out.println(next);

        for (i = 0; i < n-2; ++i)
        {
            n3 = previous + next;
            System.out.println(n3);
            previous = next;
            next = n3;
        }
    }
}
