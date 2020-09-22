/**
 * @author lanqilu
 * @date Created in 2020/09/22  15:28
 * @description Java内置System.nanoTime()方法统计代码执行时间
 */
public class TimeIntervalTest2 {
    public static void main(String[] args) throws InterruptedException {
        // 开始时间
        long stime = System.nanoTime();
        // 执行时间（1s）
        Thread.sleep(1000);
        // 结束时间
        long etime = System.nanoTime();
        // 计算执行时间
        System.out.printf("执行时长: %d 纳秒.", (etime - stime));
        System.out.println();
        System.out.printf("执行时长: %d 毫秒.", (etime - stime)/1000000);
    }
}
