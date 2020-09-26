package c3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lanqilu
 * @date Created in 2020/09/26  10:48
 * @description \
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            // 将数组中的最后一个数覆盖number[r], 并将n-1
            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        System.out.println(Arrays.toString(result));
    }
}
