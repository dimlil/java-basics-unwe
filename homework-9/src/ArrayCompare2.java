import java.util.Scanner;
import java.util.Arrays;

public class ArrayCompare2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many in first array: ");
        int arr1length = sc.nextInt();
        System.out.print("How many in second array: ");
        int arr2length = sc.nextInt();
        double[] firstArr = new double[arr1length];
        String[] secondArr = new String[arr2length];
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print("1st array number: ");
            firstArr[i] = sc.nextDouble();
        }
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print("2nd array number: ");
            secondArr[i] = sc.next();
        }
        int resultLength = 0;
        if (arr1length > arr2length) {
            resultLength = arr1length;
        } else {
            resultLength = arr2length;
        }
        int[] result = new int[resultLength];

        for (int i = 0; i < firstArr.length; i++) {
            int x = (int)firstArr[i];
            for (int j = 0; j < secondArr.length; j++) {
                int y =Integer.parseInt(secondArr[j]);
                if (x == y) {
                    result[i] = x;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println("Match: " + result[i]);
            }
        }
    }
}
