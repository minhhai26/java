import java.util.Scanner;

public class Songay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tháng: ");
        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Tháng " + month + " có 31 ngày");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Tháng " + month + " có 30 ngày");
        } else if (month == 2) {
            System.out.println("Nhập năm: ");
            int year = sc.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Tháng 2 năm " + year + " có 29 ngày.");
            } else {
                System.out.println("Tháng 2 năm " + year + " có 28 ngày.");
            }
        } else {
            System.out.println("Tháng không hợp lệ! Vui lòng nhập số từ 1 đến 12.");
        }

        sc.close();
    }
}

