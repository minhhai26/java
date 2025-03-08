public class DrawTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print("i = " + i + ", j = " + j);
            }
        }
    }
}
