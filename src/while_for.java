import java.util.Scanner;

// Bài tập tính tổng số chẵn từ 0 đến a
public class while_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số a: ");

        int a = sc.nextInt();
        int sum = 0;
        int i = 0;

        if (a % 2 != 0) {
            System.out.println("Số " + a + " là số lẻ");
        } else {
         /*  for (int i = 0; i <= a; i += 2)
               sum += i;*/
            while (i <= a) {
                sum += i;
                i += 2;
            }
            System.out.println("Tổng các chữ số chẵn là: " + sum);
        }
    }
}

