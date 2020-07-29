package control;

/**
 * @author lanqilu
 * @package control
 * @date Created in 2020/07/29  09:19
 * @description return
 **/
public class TestWithReturn {
    static int test(int testVal, int target) {
        if (testVal > target) {
            return +1;
        }
        if (testVal < target) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 5));
    }
}
