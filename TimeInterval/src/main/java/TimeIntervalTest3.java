import java.util.Date;

/**
 * @author lanqilu
 * @date Created in 2020/09/22  15:32
 * @description
 */
public class TimeIntervalTest3 {
    public static void main(String[] args) throws InterruptedException {
        // 开始时间
        Date sdate = new Date();
        // 执行时间（1s）
        Thread.sleep(1000);
        // 结束时间
        Date edate = new Date();
        // 计算执行时间
        System.out.printf("执行时长: %d 毫秒.", (edate.getTime() - sdate.getTime()));
    }
}

