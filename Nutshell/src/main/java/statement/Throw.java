package statement;

/**
 * @author lanqilu
 * @date Created in 2020/08/07  16:03
 * @description
 */
public class Throw {
    public static void main(String[] args) {
        factorial(6);
        factorial(-1);
    }

    public static double factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x must be >= 0");
        }
        double fact;
        for (fact = 1.0; x > 1; fact *= x, x--) {
            System.out.print(x + ",");
        }
        System.out.println();
        return fact;
    }
}
