package c3;

/**
 * @author lanqilu
 * @date Created in 2020/09/22  23:43
 * @description floorMod测试
 */
public class MathTest {
    public static void main(String[] args) {
        int i = Math.floorMod(15, 2);
        int j = Math.floorMod(-15, 2);
        int k = -15 % 2;
        int l = Math.floorMod(-15, -2);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
