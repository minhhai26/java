import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Array {
    // Hàm tạo ma trận
    public static void Matrix(int m, int n) {
        int[][] matrix = new int[m][n];
        Random rd = new Random();
        // Nhập phần tử
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int random = rd.nextInt(10);
                matrix[i][j] = random;
            }
        }
        // In ra ma trận
        System.out.println("Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Kích cỡ matrix
        System.out.println("Enter rows: ");
        int m = sc.nextInt();
        System.out.println("Enter cols");
        int n = sc.nextInt();



        System.out.println("1. In ma trận." + "\n"
                + "2. Tính định thức." + "\n"
                + "Nhập thao tác muốn thực hiện: ");
        String c = String.valueOf(sc.nextInt());
        switch (c) {
            case "1":
                Matrix(m, n);
                break;

        }


    }
}