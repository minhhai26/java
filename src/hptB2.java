import java.util.Scanner;

public class hptB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số từ người dùng
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        System.out.print("Nhập hệ số d: ");
        double d = scanner.nextDouble();

        System.out.print("Nhập hệ số e: ");
        double e = scanner.nextDouble();

        System.out.print("Nhập hệ số f: ");
        double f = scanner.nextDouble();

        // Tính định thức
        double dinhThuc = a * d - b * c;

        if (dinhThuc == 0) {
            System.out.println("Hệ phương trình vô nghiệm hoặc vô số nghiệm.");
        } else {

            // Tính x và y
            double x = (e * d - f * b) / dinhThuc;
            double y = (a * f - c * e) / dinhThuc;

            // In kết quả
            System.out.println("Nghiệm của hệ phương trình:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        scanner.close();

    }
}
