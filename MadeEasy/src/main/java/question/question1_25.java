package question;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * @author lanqilu
 * @date Created in 2020/10/16  13:36
 * @description 求函数的时间复杂度
 */
public class question1_25 {
    private static int Function(int n) {
        int i, j, k, count = 0;
        for (i = n / 2; i <= n; i++) {
            for (j = 1; j + n / 2 <= n; j++) {
                // TODO j++和j=j++有什么区别,如果使用j=j++,则程序有陷入到循环当中
                for (k = 1; k <= n; k = k * 2) {
                    count++;
                    System.out.println(count);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = Function(3);
        System.out.println("result = " + result);
    }
}
