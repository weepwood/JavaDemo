package initialization;

/**
 * @author lanqilu
 * @package initialization
 * @date Created in 2020/07/29  10:05
 * @description 给构造器参数
 **/
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Rock2(i);
        }
    }
}

class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}

