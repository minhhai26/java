// Bài tập tính tổng các chữ số lẻ từ 1 đến n
import java.util.Scanner;

public class while_For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");

        int num = sc.nextInt();
        int sum = 0;

        if (num % 2 != 0) {
            for (int i = 1; i <= num; i += 2)
                if (i == 3) // Tính tổng bỏ qua số 3
                    continue;
                else
                    sum += i;
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Vui lòng nhập số lẻ");
        }

        sc.close();
    }
}
