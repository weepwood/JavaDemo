package initalization;

/**
 * @author lanqilu
 * @date Created in 2020/10/02  19:11
 * @description 5.7.1 初始化的顺序
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House house = new House();
        // Shows that construction is done
        house.f();
    }

}

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    // Before constructor
    Window w1 = new Window(1);

    // 构造器函数 Show that we're in the constructor:
    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    // After constructor
    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}
