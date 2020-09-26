package c3;

import org.junit.Test;

/**
 * @author lanqilu
 * @date Created in 2020/09/24  18:23
 * @description
 */
public class StringAPI {
    @Test
    public void charAtTest() {
        String st = "Hello";
        // char charAt(int index) 返回给定位置的代码单元。
        // 除非对底层的代码单元感兴趣，否则不需要调用这个方法
        char c = st.charAt(0);
        System.out.println("c = " + c);
    }

    @Test
    public void codePointAt() {
        String st = "Hello";
        // int codePointAt(int index) 返回从给定位置开始的码点。
        int c = st.codePointAt(1);
        System.out.println("c = " + c);
    }




}
