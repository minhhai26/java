import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài = ");
        double a = sc.nextDouble();
        System.out.println("Nhập chiều rộng = ");
        double b = sc.nextDouble();
        double s = a * b;
        double p = ( a + b ) * 2;
        System.out.println("Diện tích = " + s);
        System.out.println("Chu vi = " + p);
     /*   System.out.println("Thông tin đã nhập: ");
        System.out.println("Cd: "+a);
        System.out.println("Cr: "+b);*/
    }
}
