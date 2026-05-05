public class Minesweeper {
    public static void main(String[] args) {
        int m, n, k;
        m = Integer.parseInt(args[0]);
        n = Integer.parseInt(args[1]);
        k = Integer.parseInt(args[2]);

        int[] mines = new int[k];
        for (int i = 0; i < k; i++) {
            System.out.println("Adding for "+i);
            boolean flag1 = false;
            System.out.println("flag1 - "+flag1);
            while (!flag1) {
                System.out.println("entering while");
                int position = (int) (Math.random() * (m * n)) + 1;
                System.out.println("rindex "+position);
                boolean flag = false;
                for (int j = 0; j < k; j++){
                    System.out.println("checking "+position+" in mines");
                    if (mines[j] == position){
                        flag = true;
                        System.out.println("found in mines. changing flag to true");
                        break;
                    }
                }
                if (!flag){
                    System.out.println("not found in mines, adding "+position+" in "+i);

                    mines[i] = position;
                    System.out.println("print mines");
                    for (int t = 0; t < mines.length; t++) {
                        System.out.print(mines[t] + "  ");
                    }
                    System.out.println();
                    System.out.println("flag in if - "+flag);
                    break;
                }
                System.out.println("flag - "+flag);
            }
        }

        int[] board_seq = new int[m * n];
        for (int i = 0; i < mines.length; i++) {
            board_seq[mines[i]] = -1;
            if ((mines[i] -1) >= 0 && board_seq[mines[i]-1] != -1)
                board_seq[mines[i]-1]++;
            if ((mines[i] +1) <= board_seq.length && board_seq[mines[i]+1] != -1)
                board_seq[mines[i]+1]++;
        }

//        for (int i = 0; i < board_seq.length; i++){
//
//        }

        for (int t = 0; t < board_seq.length; t++) {
            System.out.print(board_seq[t] + "  ");
        }

        int[][] board = new int[m][n];
        System.out.println();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
