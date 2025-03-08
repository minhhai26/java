public class Draw {
    public static void main(String[] args) {
        System.out.println("(a)");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 1 || j == 4 || i == 1 || i == 4) {
                    System.out.print("*" + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println(" ");
        }

        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 3 && j == 2) {
                    System.out.print("\t");
                }
                if (i == 3 && j == 3) {
                    break;
                }
                System.out.print("*" + "\t");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {

                System.out.print(j +"\t");
                System.out.println(i);

            }
            System.out.println("*");
        }

    }
}
