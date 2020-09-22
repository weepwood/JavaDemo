package c3;

/**
 * @author lanqilu
 * @date Created in 2020/09/22  22:44
 * @description 命令行参数
 */
public class Message {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("-h")) {
            System.out.print("Hello,");
        }
        else if (args[0].equals("-g")) {
            System.out.print("Goodbye,");
        }
        // print the other command -line arguments
        for (int i = 1; i < args.length; i++) {
            System.out.print(" " + args[i]);
        }
        System.out.println("!");
    }
}
