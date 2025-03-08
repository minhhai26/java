import java.util.Random;

public class BaiTap {

    /*   public static boolean tamGiac(double a, double b, double c) {
           return ((a + b) > c && (a + c) > b && (b + c) > a);
       }
       public static void main(String[] args) {
           double a = 5;
           double b = 3;
           double c = 888;
           boolean d = tamGiac(a, b, c);
           System.out.println(d);
           }*/
    public static boolean isPrime(int k) {
      /*  int result = 0;
        for (int i = 1; i <=*//**//* k; i++) {
            if (k % i == 0)
                result++;
        }
        if (result == 2)
            return true;
        else
            return false;*/

        if (k < 2) return false;
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int k = rd.nextInt(1, 101);
        System.out.println(k);
        boolean c = isPrime(k);
        System.out.println(c);
    }
}



