package collections;

import java.util.ArrayList;

/**
 * @author lanqilu
 * @package collections
 * @date Created in 2020/07/30  10:54
 * @description 向上转型也可以像作用于其他类型一样作用于泛型
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}

class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}
