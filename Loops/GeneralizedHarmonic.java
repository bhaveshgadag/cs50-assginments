public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n, r;
        double h = 0;
        n = Integer.parseInt(args[0]);
        r = Integer.parseInt(args[1]);

        for (int i = 1; i <= n; i++) {
            h = h + (1.0 / Math.pow(i, r));
        }
        System.out.println(h);
    }
}
