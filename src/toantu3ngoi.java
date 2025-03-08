import java.util.Scanner;

public class toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập điểm: ");
        int match = sc.nextInt();

        String diem = (match >= 8 || (match < 8 && match >= 6.5) || (match < 6.5 && match >= 5))  ? ("Giỏi") : ("Khá");

        System.out.println("Danh hiệu học sinh: " + diem);

        sc.close();

    }
}
