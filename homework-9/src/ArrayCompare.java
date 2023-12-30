import java.util.Scanner;
import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many in first array: ");
        int arr1length = sc.nextInt();
        System.out.print("How many in second array: ");
        int arr2length = sc.nextInt();
        int[] firstArr = new int[arr1length];
        int[] secondArr = new int[arr2length];
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print("1st array number: ");
            firstArr[i] = sc.nextInt();
        }
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print("2nd array number: ");
            secondArr[i] = sc.nextInt();
        }
        int resultLength = 0;
        if (arr1length > arr2length) {
            resultLength = arr1length;
        } else {
            resultLength = arr2length;
        }
        int[] result = new int[resultLength];

        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (firstArr[i] == secondArr[j]) {
                    result[i] = firstArr[i];
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
