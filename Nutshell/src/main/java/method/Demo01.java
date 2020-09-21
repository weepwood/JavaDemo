package method;

/**
 * @author lanqilu
 * @date Created in 2020/08/07  16:18
 * @description
 */
public class Demo01 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        }
        else {
            System.out.println("Hello world");
        }
    }
}
