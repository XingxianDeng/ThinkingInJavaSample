package reusing;

import static net.mindview.util.Print.print;

/**
 * @author Dylan
 * @version 1.00 3/30/2017
 */
public class Bath {
    private String // Initializing at point of definition:
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        print("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    /*Instance initialization*/ {
        i = 47;
    }

    @Override
    public String toString() {
        if (s4 == null)  // Delayed initialization:
            s4 = "Joy";
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }
}

class Soap {
    private String s;

    Soap() {
        print("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}