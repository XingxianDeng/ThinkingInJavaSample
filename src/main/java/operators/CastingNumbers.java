package operators;

import static net.mindview.util.Print.print;

/**
 * What happens when you cast a float
 * or double to an integral value?
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        print("(int)above: " + (int) above);
        print("(int)below: " + (int) below);
        print("(int)fabove: " + (int) fabove);
        print("(int)fbelow: " + (int) fbelow);
    }
}
