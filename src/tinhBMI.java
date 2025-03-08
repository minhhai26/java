import java.util.Scanner;

public class tinhBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều cao (m): ");
        double chieuCao = sc.nextDouble();

        System.out.println("Nhập cân nặng (kg): ");
        double canNang = sc.nextDouble();

        double BMI = canNang / Math.pow(chieuCao, 2);
        System.out.println("Chỉ số BMI của bạn là: " + BMI);

        if (BMI < 15) {
            System.out.println("Thân hinh quá gầy");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("Thân hình gầy");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("Thân hình hơi gầy");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Thân hình bình thường");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Thân hình hơi béo");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("Thân hình béo");
        } else {
            System.out.println("Thân hình quá béo");
        }

        sc.close();

    }
}
