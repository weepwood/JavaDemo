package c3;

import org.junit.Test;

/**
 * @author lanqilu
 * @date Created in 2020/09/24  18:56
 * @description 码点
 */
public class CodePoint {
    public static void main(String[] args) {
        String hello = "hi𝕆";
        System.out.println(hello.length());//4
        System.out.println(hello.codePointCount(0, hello.length()));//3
    }

    @Test
    public void show() {
        String hello = "hi𝕆";
        int length = hello.length();
        for (int i = 0; i < length; i++) {
            char charAt = hello.charAt(i);
            System.out.println(Integer.toHexString(charAt));
        }

        int codePointCount = hello.codePointCount(0, length);
        for (int i = 0; i < codePointCount; i++) {
            int charAt = hello.codePointAt(i);
            System.out.println(Integer.toHexString(charAt));
        }
    }
}
