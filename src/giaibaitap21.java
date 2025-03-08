import java.util.Scanner;

public class giaibaitap21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = sc.nextDouble();

        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        sc.nextLine(); //để tránh lỗi khi nhập chuỗi c sau khi nhập số.

        System.out.println("Enter phép tính: ");
        String c = sc.nextLine();

        String tinh = kyTu(a, b, c);
        System.out.println(tinh);
    }

    public static String kyTu(double a, double b, String c) {
        return switch (c) {
            case "+" -> "result: " + (a + b);
            case "-" -> "result: " + (a - b);
            case "*" -> "result: " + (a * b);
            case "/" -> "result: " + (a / b);
            default -> "Vui lòng nhập đúng! ";
        };
    }
}
