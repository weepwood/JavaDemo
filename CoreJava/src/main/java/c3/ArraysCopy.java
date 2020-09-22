package c3;

import java.util.Arrays;

/**
 * @author lanqilu
 * @date Created in 2020/09/22  19:43
 * @description 数组进行拷贝
 */
public class ArraysCopy {
    public static void main(String[] args) {
        int[] luckyNumbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] transLuckyNumbers = luckyNumbers;
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        System.out.println("(luckyNumbers == transLuckyNumbers) = " + (luckyNumbers == transLuckyNumbers));
        System.out.println("(luckyNumbers == copiedLuckyNumbers) = " + (luckyNumbers == copiedLuckyNumbers));

        System.out.print("[");
        for (int element : copiedLuckyNumbers) {
            System.out.print(element);
            System.out.print(",");
        }
        System.out.println("]");
    }
}
