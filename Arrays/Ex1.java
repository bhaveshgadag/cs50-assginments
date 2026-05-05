public class Ex1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] seq = new int[n*n];

        int[] t1 = new int[1];
        t1[0] = 0;

        while (t1.length < (n*n)){

            int[] t2 = new int[t1.length];
            for (int i = 0; i < t1.length; i++) {
                if (t1[i] == 0)
                    t2[i] = 1;
                else
                    t2[i] = 0;
            }

            int a1 = t1.length;
            int b1 = t2.length;

            int c1 = a1 + b1;
            int[] c = new int[c1];

            for (int i = 0; i < a1; i = i + 1) {
                c[i] = t1[i];
            }
            for (int i = 0; i < b1; i = i + 1) {
                c[a1 + i] = t2[i];
            }

            t1 = c;
        }


        for (int i = 0; i < t1.length; i++)
            System.out.print(t1[i] + " ");

        System.out.println("\n"+t1.length);
    }
}
