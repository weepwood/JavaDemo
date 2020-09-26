package c3;

/**
 * @author lanqilu
 * @date Created in 2020/09/24  18:44
 * @description
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String ch = "Hel";
        String str = "lo";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ch);
        stringBuilder.append(str);

        String string = stringBuilder.toString();
        System.out.println("string = " + string);

        System.out.println("stringBuilder.length() = " + stringBuilder.length());
    }
}
