package initialization;

/**
 * @author lanqilu
 * @package initialization
 * @date Created in 2020/07/29  09:59
 * @description 构造器
 **/
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class Rock {
    Rock() { // 这是一个构造器
        System.out.print("Rock ");
    }
}

