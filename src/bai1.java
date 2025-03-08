import java.util.Scanner;

public class bai1 {
    /* public static void main(String[] args) {
       int a = 6;
         System.out.println("A) " +((float)(a += 3)));
         System.out.println("B) " +(a -= 5));
         System.out.println("C) " +(a *= 2));
         System.out.println("D) " +((float)(a %= 5)));
         int b = 2;
         b += 7;
         System.out.println(a -= b );
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String ten = scanner.nextLine();

        System.out.println("Mã sinh viên: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        String tuoi = scanner.nextLine();

        System.out.println("Thông tin đã nhập: ");
        System.out.println("Tên : " + ten);
        System.out.println("Mã sv: " + a);
        System.out.println("Tuổi: " + tuoi);
    }
}

