package collections;

import array.Array;

import java.util.*;

/**
 * @author lanqilu
 * @package collections
 * @date Created in 2020/07/30  11:08
 * @description
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(collection);


        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(collection);

        Collections.addAll(collection, 11, 12, 13, 14, 15);
        System.out.println(collection);

        Collections.addAll(collection, moreInts);
        System.out.println(collection);

        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        System.out.println(list);

    }
}
