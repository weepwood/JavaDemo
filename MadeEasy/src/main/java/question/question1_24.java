package question;

/**
 * @author lanqilu
 * @date Created in 2020/10/16  13:30
 * @description 函数的时间复杂度
 */
public class question1_24 {
    private static int Function(int n) {
        int i, count = 0;
        for (i = 1; i * i < n; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = Function(10);
        System.out.println("result = " + result);
    }
}
