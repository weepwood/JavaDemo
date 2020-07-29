package control;

/**
 * @author lanqilu
 * @package control
 * @date Created in 2020/07/29  08:40
 * @description if语句
 **/
public class IfElse {

    static void test(int testVal, int target) {
        if (testVal > target) {
            System.out.println("testVal > target");
        }
        else if (testVal < target) {
            System.out.println("testVal < target");
        }
        else {
            System.out.println("testVal = target");
        }
    }

    public static void main(String[] args) {
        test(10, 5);

        test(5, 10);

        test(5, 5);

    }
}
