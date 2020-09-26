package c3;

/**
 * @author lanqilu
 * @date Created in 2020/09/23  11:21
 * @description 码点
 */
public class CharTest {
    public static void main(String[] args) {
        String greeting = "Hello";
        int n = greeting.length();
        System.out.println("n = " + n);

        char first = greeting.charAt(0);
        char last = greeting.charAt(4);

        int index = greeting.offsetByCodePoints(0, 2);
        int cp = greeting.codePointAt(index);

        System.out.println("first = " + first);
        System.out.println("last = " + last);
        System.out.println("index = " + index);
        System.out.println("cp = " + cp);
    }
}
