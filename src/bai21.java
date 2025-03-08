import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = sc.nextDouble();
        System.out.println("Enter number b: ");
        double b = sc.nextDouble();
        System.out.println("Enter number c: ");
        double c = sc.nextDouble();
        String result = GPTBac2(a, b, c);
        System.out.println(result);
    }

    public static String GPTBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0 && c == 0) return "Phương trình vô số nghiệm";
            else if (b == 0 && c != 0) return "Phương trình vô nghiệm";
            else return "Phương trình bậc nhất có nghiệm x = " + (-c / b);
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Phương trình bậc hai có hai nghiệm phân biệt x1 = " + x1 + "; x2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                return "Phương trình bậc hai có nghiệm kép x = " + x;
            } else return "Phương trình bậc hai vô nghiệm";
        }
    }
}
