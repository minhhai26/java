import java.util.Scanner;

public class DayFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng số Fibonacci cần in: ");
        int n = sc.nextInt();

        int a = 0, b = 1, next;

        System.out.print("Dãy Fibonacci: " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        sc.close();
    }
}
