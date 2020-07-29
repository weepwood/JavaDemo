package control;

/**
 * @author lanqilu
 * @package control
 * @date Created in 2020/07/29  08:47
 * @description 计数，for循环Demo
 **/
public class ListCharacters {
    public static void main(String[] args) {
        char ascii = 128;
        for (char c = 0; c < ascii; c++) {
            //判断字符是否为小写
            if (Character.isLowerCase(c)) {
                System.out.println("value: " + (int) c +
                        " character: " + c);
            }
        }
    }
}
