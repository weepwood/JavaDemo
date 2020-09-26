package c3;

import org.junit.Test;

import java.io.Console;
import java.util.Scanner;

/**
 * @author lanqilu
 * @date Created in 2020/09/25  13:47
 * @description 输入和输出
 */
public class In {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        // 读取一行的输入，此外 next读取一个单词 nextInt读取一个整数 nextDouble
        String name = in.nextLine();
        System.out.print("How old are you? ");
        int age = in.nextInt();

        System.out.println("Hello, " + name + ". Next year,you'll be " + (age + 1));

    }

}
