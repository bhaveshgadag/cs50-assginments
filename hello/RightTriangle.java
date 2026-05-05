/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
// Write a program RightTriangle that takes three int command-line arguments
// and determines whether they constitute the side lengths of some right triangle.
public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int hypo = Math.max(a, b);
        int side1 = Math.min(a, b);
        int side2 = Math.min(hypo, c);
        hypo = Math.max(hypo, c);

        System.out.println(hypo * hypo == ((side1 * side1) + (side2 * side2)));

    }
}
