package api;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @author lanqilu
 * @date Created in 2020/08/08  10:53
 * @description 绘图
 */
public class StdDrawDemo {
    public static void main(String[] args) {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i*i);
            StdDraw.point(i, i*Math.log(i));

        }
    }
}
