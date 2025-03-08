import java.util.Scanner;

public class Namnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập năm: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            System.out.println("Năm " + year + " là năm không nhuận");
        }

        sc.close();
    }
}
