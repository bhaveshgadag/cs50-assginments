public class Birthday {
    public static void main(String[] args) {
        int n, trials;
        n = Integer.parseInt(args[0]);
        trials = Integer.parseInt(args[1]);

        int[] exp = new int[trials];

        int c = 0;
        while (c < trials) {
            boolean flag = false;
            int p = 0; // person number
            int[] room = new int[n]; // Reset room for new trial
            // Start trial
            while (!flag && p < room.length) {
                int bday = (int) (Math.random() *  n );
                boolean found = false;
                for (int i = 0; i < p; i++) {
                    // Check if person with same birthdate is in room
                    if (room[i] == bday) {
                        // if found have that person enter room and stop trial
                        found = true; // change flag to stop trial
                        break;
                    }
                }
                // duplicate found, end exp
                if (found) {
                    flag = true;
                }
                // duplicate not found, add person with birthday to room
                else {
                    if (p < n) {
                        room[p] = bday;
                        p++;
                    }
                }
            }
            exp[c] = p; // store pth person when duplicate found
            c++;
        }

        long[] result = new long[n + 1];
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
