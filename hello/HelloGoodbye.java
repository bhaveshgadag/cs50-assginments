/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

// Write a program HelloGoodbye.java that takes two names as command-line
// arguments and prints hello and goodbye messages as shown below (with the
// names for the hello message in the same order as the command-line arguments
// and with the names for the goodbye message in reverse order).

public class HelloGoodbye {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        System.out.println("Hello " + a + " and " + b + ".");
        System.out.println("Goodbye " + b + " and " + a + ".");
    }
}
