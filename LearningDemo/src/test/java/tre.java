/**
 * @author lanqilu
 * @date Created in 2020/08/03  10:06
 * @description
 */
public class tre {
    public static void main(String[] args) {
        double f = 1.0 / 0.0;
        System.out.println("f.MAX_VALUE = " + f);

        String letter = "o";
        String s = "hello";              // 这两个String对象
        String t = "hell" + letter;      // 保存的文本完全一样
        if (s == t) {
            System.out.println("equal"); // 但是，二者并不相等！
        }

        byte[] a = {1, 2, 3};
// 内容一样的副本
        byte[] b = (byte[]) a.clone();
        if (a == b) {
            System.out.println("equal"); // 但是，二者并不相等！
        }
    }


}
