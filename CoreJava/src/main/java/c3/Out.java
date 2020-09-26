package c3;

import org.junit.Test;

import java.util.Date;

/**
 * @author lanqilu
 * @date Created in 2020/09/25  16:38
 * @description
 */
public class Out {
    @Test
    public void printfTest() {
        Double x = 123456789.36939485;
        Double s = 123.36939485;
        // 打印字符宽度为8,精确到小数点后两位
        System.out.printf("%8.2f", x);
        System.out.println();
        System.out.printf("%8.2f", s);
    }

    @Test
    public void change() {
        int x = 19;
        System.out.print("十进制整数: ");
        System.out.printf("%d", x);
        System.out.println();
        System.out.print("十六进制整数: ");
        System.out.printf("%x", x);
        System.out.println();
        System.out.print("八进制整数: ");
        System.out.printf("%o", x);
    }

    @Test
    public void inBracket() {
        System.out.printf("%,(.2f", -12345.4567);
    }

    @Test
    public void timeTest() {
        System.out.printf("%tc", new Date());
    }
}
