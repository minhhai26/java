import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num;

            System.out.println("Enter number > 0: ");
            num = sc.nextInt();

            while (num <= 0) {
                System.out.println("Please enter the correct request!");
                num = sc.nextInt();
            }
            System.out.println("That's right!");

            int uoc = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) { //Tìm ước của num
                    uoc++; //Nhận ước
                }
            }

            if (uoc == 2) { //Nếu ước chỉ có 2 số thì kết luận là số nguyên tố và ngược lại
                System.out.println("Số " + num + " Là số nguyên tố");
            } else {
                System.out.println("Số " + num + " Không là số nguyên tố");
            }


            System.out.print("Bạn có muốn tiếp tục sử dụng phần mềm không?(Vui lòng nhập \"có\" hoặc \"không\"): ");

            String traloi = scanner.nextLine();

            if (traloi.equals("có") || traloi.equals("co"))
                continue;
            else if (traloi.equals("không") || traloi.equals("khong"))
                break;
        }
    }
}

