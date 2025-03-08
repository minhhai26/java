import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số để chọn: ");
        System.out.println("1. Tìm tên tác giả");
        System.out.println("2. Thông tin tác giả");
        System.out.println("3. Thông tin sách");
        System.out.println("4. Đánh giá");

        int so = sc.nextInt();

        switch (so) {
            case 1:
                System.out.println("Tìm tên tác  giả");
                break;
            case 2:
                System.out.println("Thông tin tác giả");
                break;
            case 3:
                System.out.println("Thông tin sách");
                break;
            case 4:
                System.out.println("Đánh giá");
                break;
            default:
                System.out.println("Vui lòng nhập đúng số!");
                break;
        }

        sc.close();
    }
}
