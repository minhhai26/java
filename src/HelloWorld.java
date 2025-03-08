public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("(a)");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 2 && j == 1) {
                    continue;
                } else if (i == 3 && j == 1) {
                    continue;
                } else if (i == 3 && j == 2) {
                    continue;
                } else if (i == 4 && j == 1) {
                    continue;
                } else if (i == 4 && j == 2) {
                    continue;
                } else if (i == 4 && j == 3) {
                    continue;
                }
                System.out.print(i + "" + j + "\t");
            }
            System.out.println("");
        }

    }
}

