public class BaiTapTrenLop {
    public static void main(String[] args) {
        //Chương trình kiểm tra số có ba chữ số chia hết cho 23
        /*for (int i = 100; i <= 999; i++){
            if (i % 23 == 0){
                System.out.println("Số chia hết cho 23 có ba chữ số là: " +i);
            }
        }*/
       /* int k = 999;
        while (k >= 100) {
            if (k % 23 == 0) {
                System.out.println(k + " chia het cho 23");
                break;
            }
            k = k - 1;
        }*/
     /*   int i = 100;
        do {
            i++;
            if (i % 23 == 0) {
                System.out.println(i);
            }
        } while (i <= 999);*/
        /*int date;
        for(int i = 2; i <= 31; i++){
            date = (i-2)% 7;// day of week
            if (date > 4) continue; // thu 7 va chu nhat
            System.out.println(i + "/3/2020");
            }*/
        int date;
        int i = 2;
        while (i < 31) {

            date = (i - 2) % 7;
            ++i;
            if (date > 4)
                continue;
            System.out.println(i + "/3/2020");

        }


    }
}

