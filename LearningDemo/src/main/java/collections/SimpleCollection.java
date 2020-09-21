package collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lanqilu
 * @package collections
 * @date Created in 2020/07/30  11:00
 * @description
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ",");
        }

    }
}
