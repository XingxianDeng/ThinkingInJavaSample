package arrays;

import net.mindview.util.Generated;

import java.util.Arrays;
import java.util.Comparator;

import static net.mindview.util.Print.print;

class CompTypeComparator implements Comparator<CompType> {
    public int compare(CompType o1, CompType o2) {
        return (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
    }
}

/**
 * Implementing a Comparator for a class.
 *
 * @author Dylan.Deng
 * @version 1.00 2016-08-08
 */
public class ComparatorTest {
    public static void main(String[] args) {
        CompType[] a = Generated.array(
                new CompType[12], CompType.generator());
        print("before sorting:");
        print(Arrays.toString(a));
        Arrays.sort(a, new CompTypeComparator());
        print("after sorting");
        print(Arrays.toString(a));
    }
}