import java.util.Scanner;

public class TaylorSeries {
    // Hàm tính e^x
    public static double Taylor(double x, int n) {
        double sum = 1, term = 1;
        for (int i = 1; i < n; i++) {
            term *= x / i;
            sum += term;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = sc.nextDouble();

        int n;
        do {
            System.out.print("Enter n (must be > 0): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Số lượng số hạng phải lớn hơn 0! Vui lòng nhập lại.");
            }
        } while (n <= 0);

        System.out.println(Taylor(x, n));

        sc.close();
    }
}

