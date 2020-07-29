package control;

/**
 * @author lanqilu
 * @package control
 * @date Created in 2020/07/29  08:57
 * @description 使用 for-in 循环语法来遍历元素
 **/
public class ForInString {
    public static void main(String[] args) {
        //toCharArray()，返回值类型为 char 数组
        for (char c : "An African Swallow".toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
