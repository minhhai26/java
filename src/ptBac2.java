import java.util.Scanner;

public class ptBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = sc.nextDouble();

        System.out.println("Nhập hệ số b: ");
        double b = sc.nextDouble();

        System.out.println("Nhập hệ số c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: " + x1);
        } else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt: " + x1 + " và " + x2);
        }

        sc.close();
    }
}
