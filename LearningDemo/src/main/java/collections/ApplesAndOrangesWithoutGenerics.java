package collections;

import array.Array;

import java.util.ArrayList;

/**
 * @author lanqilu
 * @package collections
 * @date Created in 2020/07/30  10:38
 * @description 没有泛型的 ArrayList
 */
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // No problem adding an Orange to apples
        apples.add(new Orange());
        for (Object apple : apples) {
            ((Apple)apple).id();
            //Orange is detected only at run time
        }

    }
}

class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}

//如果一个类没有显式地声明继承自哪个类，那么它就自动继承自 Object
class Orange{}

