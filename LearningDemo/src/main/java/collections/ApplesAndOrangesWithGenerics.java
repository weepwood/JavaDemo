package collections;

import java.util.ArrayList;

/**
 * @author lanqilu
 * @package collections
 * @date Created in 2020/07/30  10:50
 * @description 使用泛型
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        //菱形语法
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (Apple apple : apples) {
            System.out.println(apple.id());
        }

    }
}
