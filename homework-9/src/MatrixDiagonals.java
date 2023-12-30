import java.util.Scanner;

public class MatrixDiagonals {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Size: ");
        int size = scanner.nextInt();
        
        char[][] matrix = new char[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 'X';
                } else if (i == size - j - 1) {
                    matrix[i][j] = 'Y';
                } else {
                    matrix[i][j] = '-';
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
