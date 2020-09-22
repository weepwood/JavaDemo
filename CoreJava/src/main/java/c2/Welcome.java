package c2;

/**
 * @author lanqilu
 * @date Created in 2020/09/22  15:11
 * @description
 */
public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");

        }
        System.out.println();
    }
}
