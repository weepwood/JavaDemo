package collections;

import java.util.ArrayList;

/**
 * @author lanqilu
 * @date Created in 2020/10/02  20:25
 * @description 11.1 使用泛型，在编译期防止将错误的对象防止到容器中
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
