package c3;

import java.util.Scanner;

/**
 * @author lanqilu
 * @date Created in 2020/09/22  16:12
 * @description 输入输出
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 获得第一个输入
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // 获得第二个输入
        System.out.print("How old are you? ");
        int age = in.nextInt();

        // 显示到console
        System.out.println("Hello, "+ name+ ". Next year, you'll be " + (age + 1));
    }
}
