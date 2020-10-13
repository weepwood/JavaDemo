package collections;

import java.util.ArrayList;

/**
 * @author lanqilu
 * @date Created in 2020/10/02  20:16
 * @description 容器
 */
public class ApplesAndOrangesWithoutGenerics {
    // 表示只有有关不受检查的异常的警告信息应该被抑制
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // Not prevented from adding an Orange to apples:
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple) apples.get(i)).id();
            // Orange is detected only at run time
        }
    }
}

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {

}
