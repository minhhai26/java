public class timsohoanHao {
    public static void main(String[] args) {

        for (int n = 1; n < 1000; n++) {
            int sum = 0; //Reset sum mỗi lần kiểm tra số mới

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i; //Tổng các ước của n
                }
            }

            if (sum == n) { //Nếu tổng bằng ước thì kết luận
                System.out.println(n + " là số hoàn hảo");
            }
        }
    }
}