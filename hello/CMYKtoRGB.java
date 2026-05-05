/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan, magenta, yellow, black, white;
        int red, green, blue;
        cyan = Double.parseDouble(args[0]);
        magenta = Double.parseDouble(args[1]);
        yellow = Double.parseDouble(args[2]);
        black = Double.parseDouble(args[3]);

        white = 1.0 - black;
        red = (int) Math.round(255.0 * white * (1 - cyan));
        green = (int) Math.round(255.0 * white * (1 - magenta));
        blue = (int) Math.round(255.0 * white * (1 - yellow));

        System.out.println("red \t= " + red);
        System.out.println("green\t= " + green);
        System.out.println("blue\t= " + blue);

    }
}
