import java.util.Scanner;
import java.io.PrintStream;

public class test {
    /* public static void printIsPositive(int x) {
         if (x > 0) // only IF branch
             System.out.print(x + " is positive");
             System.out.println(" (By printIsPositive!)");
     }

     public static void main(String[] args) {
         printIsPositive(10);
         printIsPositive(-3);
     }
 }*/
//    public static void main(String[] args) {
//        int date;
        /*for (int i = 2; i <= 31; i++) {
            date = (i - 2) % 7;// day of week
            System.out.println(date);
            if (date > 4) continue; // thu 7 va chu nhat
            System.out.println(i + "/3/2020");
        }*/

    /*public static boolean Check(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        int check = 2;

        while (count < num) {
            if (Check(check)) {
                System.out.print(check + " ");
                count++;
            }
            check++;
        }
    }*/
    public static boolean CheckPrime(int n) {
        //Hàm kiểm tra số nguyên tố
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n < 2) {
            System.out.println("False");
            return;
        }
        //Kiểm tra từng thành phần của số
        while (n > 0) {
            if (!CheckPrime(n)) {
                System.out.println("False");
                return;
            }
            n /= 10; // Cắt bỏ chữ số bên phải
        }
        System.out.println("True");
    }
}
