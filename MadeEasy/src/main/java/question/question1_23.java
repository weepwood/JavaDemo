package question;

/**
 * @author lanqilu
 * @date Created in 2020/10/16  13:21
 * @description 下面的函数运行的时间是多少
 */
public class question1_23 {
    public static void Function(int n) {
        int i = 1, s = 1;
        while (s <= n) {
            i++;
            s = s + i;
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        Function(10);
    }
}
/* Answer
 * s是以步长i增加而不是1增加
 */
