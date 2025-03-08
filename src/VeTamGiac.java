public class VeTamGiac {
    public static void main(String[] args) {
        // Tam giác lủng
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                if (i == 2 && j == 3)
                    System.out.print("\t");
                if (i == 2 && j == 2)
                    continue;
                System.out.print("*" + "\t");
            }
            System.out.println();
        }*/
        // Tam giác góc ở giữa
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("i\t"); // In khoảng trắng để căn chỉnh
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t"); // In dấu *
            }
            System.out.println();
        }*/
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print("o\t");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("i\t");
            System.out.println();
        }
        }
    }
