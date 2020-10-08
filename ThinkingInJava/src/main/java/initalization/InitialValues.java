package initalization;

/**
 * @author lanqilu
 * @date Created in 2020/10/02  15:09
 * @description 基本数据类型的初始值
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValues() {
        System.out.println("Data type      Initial value");
        System.out.println(("boolean        " + t));
        // char值为0,显示空白
        System.out.println("char           [" + c + "]");
        System.out.println("byte           " + b);
        System.out.println("short          " + s);
        System.out.println("int            " + i);
        System.out.println("long           " + l);
        System.out.println("float          " + f);
        System.out.println("double         " + d);
        System.out.println("reference      " + reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
    }
}
