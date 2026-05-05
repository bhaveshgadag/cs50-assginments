/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double r = 6371.0;
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double t1, t2, sqt, dist;
        t1 = Math.pow(Math.sin((x2 - x1) / 2), 2);
        t2 = Math.pow(Math.sin((y2 - y1) / 2), 2);
        sqt = Math.sqrt(t1 + (Math.cos(x1) * Math.cos(x2) * t2));
        dist = 2 * r * Math.asin(sqt);
        System.out.println(dist + " kilometers");
    }
}
