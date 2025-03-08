import java.util.Scanner;

public class SuperPrimeChecker {
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Hàm kiểm tra số siêu nguyên tố
    public static boolean isSuperPrime(int n) {
        while (n > 0) {
            if (!isPrime(n)) {
                return false;
            }
            n /= 10; // Cắt bỏ chữ số bên phải
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isSuperPrime(number)) {
            System.out.println(number + " là số siêu nguyên tố.");
        } else {
            System.out.println(number + " không phải là số siêu nguyên tố.");
        }
    }
}
