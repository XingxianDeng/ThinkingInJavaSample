package operators;

import static net.mindview.util.Print.print;

/**
 * Rounding floats and doubles.
 *
 * @author Dylan
 * @version 1.00 3/29/2017
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        print("Math.round(above): " + Math.round(above));
        print("Math.round(below): " + Math.round(below));
        print("Math.round(fabove): " + Math.round(fabove));
        print("Math.round(fbelow): " + Math.round(fbelow));
    }
}
