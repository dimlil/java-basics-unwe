import java.util.Scanner;

public class MatrixHorizontal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();

        System.out.print("Columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = count++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
