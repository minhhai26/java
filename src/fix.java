public class fix {
    public static void main(String[] args) {
        System.out.println("a");

        // Ma trận đánh dấu các cặp (i, j) cần bỏ qua
        boolean[][] skip = new boolean[5][5];
        skip[2][1] = true;
        skip[3][1] = true;
        skip[3][2] = true;
        skip[4][1] = true;
        skip[4][2] = true;
        skip[4][3] = true;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (skip[i][j]) continue;
                System.out.print(i + "" + j + "\t");
            }
        }
        System.out.println();
    }
}
