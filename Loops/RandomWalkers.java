public class RandomWalkers {
    public static void main(String[] args) {
        int r, trials;
        r = Integer.parseInt(args[0]);
        trials = Integer.parseInt(args[1]);
        double avg = 0.0;

        for (int t = 0; t < trials; t++) {
            int i, j, count;
            i = 0;
            j = 0;
            count = 0;

            while ((Math.abs(i) + Math.abs(j)) != r) {
                double prob = Math.random();
                if (prob < 0.25)
                    i++;
                else if (prob < 0.5)
                    i--;
                else if (prob < 0.75)
                    j++;
                else
                    j--;
                count++;
            }
            avg = avg + count;
        }
        avg = avg / trials;

        System.out.println("average number of steps = " + avg);
    }
}
