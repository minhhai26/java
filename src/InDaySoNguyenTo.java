import java.util.Scanner;

public class InDaySoNguyenTo {
    public static boolean Check(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số hiển thị: ");
        int num = sc.nextInt();
        int ngto = 2, count = 0;
        while (count < num) {
            if(Check(ngto)) {
                System.out.println(ngto);
                count++;
            }
            ngto++;
        }
    }
}
