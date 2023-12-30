import java.util.Scanner;
import java.util.Arrays;

public class Excel3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 0;
        int max = 0;
        int[] numbers = new int[5];
        int limit = -1;
        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            limit++;
            if (limit == numbers.length) {
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
            }
            if (num != 0) {
                numbers[limit] = num;
                sum += num;
                if (num > max) {
                    max = num;
                }
            }
        }
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min && numbers[i] != 0) {
                min = numbers[i];
            }
        }
        limit++;
        double avg = (double) sum / (limit);
        System.out.println("SUM=" + sum + ", AVERAGE=" + String.format("%.2f", avg) + ", COUNT=" + limit + ", MIN="
                + min + ", MAX=" + max);
        System.out.println(Arrays.toString(numbers));
    }
}
