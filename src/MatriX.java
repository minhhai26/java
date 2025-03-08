import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatriX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // Người dùng nhập kích thước mảng
        System.out.println("Nhập mảng tối đa: ");
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            // Số phần tử ngẫu nhiên của mảng
            int random = rd.nextInt(10);
            m[i] = random;

            /* Câu lệnh để người nhập nhập từng phần tử của mảng
            System.out.println("M[" + i + "]: ");
            m[i] = sc.nextInt();*/
        }
        System.out.print("Mảng vừa nhập: ");
        System.out.println(Arrays.toString(m));

        // Đảo ngược mảng
        for (int i = 0, j = m.length - 1; i < j; i++, j--) {
            int temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
        System.out.print("Mảng đảo ngược: ");
        System.out.println(Arrays.toString(m));

        // Sắp xếp mảng
        Arrays.sort(m);
        System.out.print("Sắp xếp tăng dần mảng vừa nhập: ");
        System.out.println(Arrays.toString(m));

        // Tính tổng các phần tử
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += m[i];
        }
        System.out.println("Tổng là: " + sum);

        //Tìm số trong mảng
        System.out.print("Moi nhap vao 1 so bat ki : ");
        int x = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (x == m[i]) {
                check = true; // Nếu xuất hiện trong mảng sẽ làm thay đổi giá trị của check
                System.out.println("Vi tri index cua so x trong mang la : " + i);
            }
        }
        if (!check) { // Phủ định của true là false vậy nên false != true, do if chỉ thực hiện khi điều kiện bằng true
            System.out.println("null");
        }
    }
}

