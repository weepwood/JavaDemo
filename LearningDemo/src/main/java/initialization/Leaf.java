package initialization;

/**
 * @author lanqilu
 * @package initialization
 * @date Created in 2020/07/29  14:23
 * @description 简单使用“this”关键字
 **/
public class Leaf {

    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
