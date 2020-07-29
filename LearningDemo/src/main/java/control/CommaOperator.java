package control;

/**
 * @author lanqilu
 * @package control
 * @date Created in 2020/07/29  08:52
 * @description 逗号操作符
 **/
public class CommaOperator {
    public static void main(String[] args) {
        //使用逗号分隔多个语句，并按顺序计算这些语句
        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
