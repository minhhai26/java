import java.util.Random;
import java.util.Scanner;

public class MayTinhMatrix {
    // Hàm tạo ma trận ngẫu nhiên
    public static int[][] generateMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        Random rd = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rd.nextInt(10); // Giá trị từ 0-9
            }
        }
        return matrix;
    }

    // Hàm in ma trận
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int m = sc.nextInt();
        System.out.println("Enter cols: ");
        int n = sc.nextInt();

        int[][] matrix = generateMatrix(m,n);
        printMatrix(matrix);

    }
}
