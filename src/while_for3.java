import java.util.Scanner;

public class while_for3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");

        int gt = 1;
        int sum = 0;
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            gt *= i;
            sum += gt;
        }

        System.out.println(+num + "! = " + gt);
        System.out.println("Tổng từ 1! đến " + num + "! = " + sum);

    }
}
