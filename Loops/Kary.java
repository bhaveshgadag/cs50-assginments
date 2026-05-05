/*Write a program Kary that takes two integer command line arguments i and k and
converts i to base k. Assume that i is an integer in Java’s long data type and
that k is an integer between 2 and 16. For bases greater than 10, use the
letters A through F to represent the 11th through 16th digits, respectively.

Convert from decimal to destination base: divide the decimal with the base
until the quotient is 0 and calculate the remainder each time. The destination
 base digits are the calculated remainders.
*/

public class Kary {
    public static void main(String[] args) {
        long i;
        int k;
        i = Integer.parseInt(args[0]);
        k = Integer.parseInt(args[1]);
        long no;
        while(i/k != 0){
            q = i/k;
            r = i%k;
            i = q;
            no =
        }
    }
}
