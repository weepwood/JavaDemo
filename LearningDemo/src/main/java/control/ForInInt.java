package control;

import static utils.Range.range;

/**
 * @author lanqilu
 * @package control
 * @date Created in 2020/07/29  09:15
 * @description 使用Range
 **/
public class ForInInt {
    public static void main(String[] args) {
        for (int i : range(10)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : range(5, 10)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : range(5, 20, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : range(20, 5, -3)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
