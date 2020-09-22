package c3;

/**
 * @author lanqilu
 * @date Created in 2020/09/22  16:00
 * @description 自增和自减
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        int m = 7;
        int n = 7;
        int a = 2 * ++m;
        int b = 2 * n++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
