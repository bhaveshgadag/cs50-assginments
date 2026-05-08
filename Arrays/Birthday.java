public class Birthday {
    public static void main(String[] args) {
        int n, trials;
        n = Integer.parseInt(args[0]);
        trials = Integer.parseInt(args[1]);

        int[] exp = new int[trials];
//        int days = 365;

        int c = 0;
        while (c < trials) {
            boolean flag = false;
            int x = 0;
            int[] room = new int[n];
            while (!flag) {
                int bday = (int) (Math.random() * (n - 1));
                for (int i = 0; i < room.length; i++) {
                    if (room[i] == bday) {
                        flag = true;
                        room[x] = bday;
                        break;
                    }
                }
                room[x] = bday;
                x++;
            }
            exp[c] = x;
            c++;
        }

        long[] result = new long[n];
        for (int i = 0; i < exp.length; i++) {
            result[exp[i]]++;
        }

        double fraction = 0.0;
        for (int i = 0; i < result.length; i++) {
            fraction = fraction + result[i];
            System.out.print((i+1)+"\t"+result[i] + "\t"+(fraction/trials));
            if (fraction/trials >= 0.5)
                break;
            System.out.println();
        }
    }
}
