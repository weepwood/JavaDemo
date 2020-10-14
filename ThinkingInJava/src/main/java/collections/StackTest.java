package collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lanqilu
 * @date Created in 2020/10/13  18:10
 * @description 堆栈
 */
public class StackTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
/* Output:
fleas has dog My
*/
