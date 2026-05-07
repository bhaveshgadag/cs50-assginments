public class Minesweeper {
    public static void main(String[] args) {
        int m, n, k;
        m = Integer.parseInt(args[0]);
        n = Integer.parseInt(args[1]);
        k = Integer.parseInt(args[2]);

        if (k <= (m * n)) {
            int[][] board = new int[m][n];
            int a = 0;
            while (a < k) {
                int r = (int) (Math.random() * m);
                int c = (int) (Math.random() * n);

                if (board[r][c] != -1) {
                    board[r][c] = -1;
                    a++;
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == -1) {
                        if ((j - 1) >= 0 && board[i][j - 1] != -1) {
                            board[i][j - 1]++;
                        }
                        if ((j + 1) < n && board[i][j + 1] != -1) {
                            board[i][j + 1]++;
                        }
                        if ((i - 1) >= 0 && board[i - 1][j] != -1) {
                            board[i - 1][j]++;
                        }
                        if ((i + 1) < m && board[i + 1][j] != -1) {
                            board[i + 1][j]++;
                        }
                        if ((i - 1) >= 0 && (j - 1) >= 0 && board[i - 1][j - 1] != -1) {
                            board[i - 1][j - 1]++;
                        }
                        if ((i - 1) >= 0 && (j + 1) < n && board[i - 1][j + 1] != -1) {
                            board[i - 1][j + 1]++;
                        }
                        if ((i + 1) < m && (j - 1) >= 0 && board[i + 1][j - 1] != -1) {
                            board[i + 1][j - 1]++;
                        }
                        if ((i + 1) < m && (j + 1) < n && board[i + 1][j + 1] != -1) {
                            board[i + 1][j + 1]++;
                        }
                    }
                }
            }


            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == -1) {
                        System.out.print("*  ");
                    } else {
                        System.out.print(board[i][j] + "  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
