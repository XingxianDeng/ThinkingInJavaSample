package arrays;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

/**
 * @author Dylan.Deng
 * @version 1.00 2016-08-07
 */
public class GeneratorsTest {
    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.print(type.getSimpleName() + ": ");
            try {
                Generator<?> g = (Generator<?>) type.newInstance();
                for (int i = 0; i < size; i++)
                    System.out.printf(g.next() + " ");
                System.out.println();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }
}