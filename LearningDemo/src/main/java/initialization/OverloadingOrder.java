package initialization;

/**
 * @author lanqilu
 * @package initialization
 * @date Created in 2020/07/29  10:11
 * @description 根据参数的顺序重载
 **/
public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 1);
        f(99, "Int first");
    }
}
