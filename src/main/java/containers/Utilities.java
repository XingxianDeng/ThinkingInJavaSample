package containers;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Simple demonstrations of the Collections utilities.
 *
 * @author Dylan.Deng
 * @version 1.00 2016-08-29
 */
public class Utilities {
    static List<String> list = Arrays.asList(
            "one Two three, Four five six one".split(" "));

    public static void main(String[] args) {
        print(list);
        print("'list' disjoint (Four)?: " +
                Collections.disjoint(list,
                        Collections.singletonList("Four")));
        print("max: " + Collections.max(list));
        print("mix: " + Collections.min(list));
        print("max w/ comparator: " + Collections.max(list,
                String.CASE_INSENSITIVE_ORDER));
        print("min w/ comparator: " + Collections.min(list,
                String.CASE_INSENSITIVE_ORDER));
        List<String> sublist =
                Arrays.asList("Four five six".split(" "));
        print("indexOfSubList: " +
                Collections.indexOfSubList(list, sublist));
        print("lastIndexOfSubList: " +
                Collections.lastIndexOfSubList(list, sublist));
        Collections.replaceAll(list, "one", "Yo");
        print("replaceAll: " + list);
        Collections.reverse(list);
        print("reverse: " + list);
        Collections.rotate(list, 3);
        print("rotate: " + list);
        List<String> source =
                Arrays.asList("in the matrix".split(" "));
        Collections.copy(list, source);
        print("copy: " + list);
        Collections.swap(list, 0, list.size() - 1);
        print("swap: " + list);
        Collections.shuffle(list, new Random(47));
        print("shuffled: " + list);
        Collections.fill(list, "pop");
        print("fill: " + list);
        print("frequency of 'pop': " +
                Collections.frequency(list, "pop"));
        List<String> dups = Collections.nCopies(3, "smap");
        print("dups: " + dups);
        print("‘list’ disjoint ‘dups’?: " +
                Collections.disjoint(list, dups));
        // Getting an old-style Enumeration:
        Enumeration<String> e = Collections.enumeration(dups);
        Vector<String> v = new Vector<String>();
        while (e.hasMoreElements())
            v.addElement(e.nextElement());
        // Converting an old-style Vector
        // to a List via an Enumeration:
        ArrayList<String> arrayList =
                Collections.list(v.elements());
        print("arrayList: " + arrayList);
    }
}