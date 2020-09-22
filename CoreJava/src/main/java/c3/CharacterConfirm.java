package c3;



/**
 * @author lanqilu
 * @date Created in 2020/09/22  23:28
 * @description
 */
public class CharacterConfirm {
    public static void main(String[] args) {
        // 确定指定字符是否允许在Java标识符的第一个字符。
        boolean a = Character.isJavaIdentifierStart('a');
        System.out.println("a = " + a);
        // 确定指定的字符是Java标识符中除首字符以外的部分。
        boolean b = Character.isJavaIdentifierPart('+');
        System.out.println("b = " + b);
    }
}
