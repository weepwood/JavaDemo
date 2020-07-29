package control;

import java.util.Random;

/**
 * @author lanqilu
 * @package control
 * @date Created in 2020/07/29  08:55
 * @description for-in 无需你去创建 int 变量和步进来控制循环计数
 **/
public class ForInFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x : f) {
            System.out.println(x);
        }
    }
}
