public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        int[] prob = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            prob[i-1] = Integer.parseInt(args[i]);
        }

        int[] sum = new int[prob.length + 1];
        int s = prob[0];
        sum[0] = 0;
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + prob[i - 1];
        }

        for (int i = 0; i < m; i++){
            int r = (int) (Math.random() * (sum[sum.length - 1] -1));
            for (int j = 0; j < sum.length; j++) {
                if ((r > sum[j]) && (r < sum[j+1])) {
                    System.out.print((j + 1)+ " ");
                }
            }
        }
    }
}
