package c4;

import edu.princeton.cs.algs4.StdOut;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author lanqilu
 * @date Created in 2020/09/26  15:35
 * @description 日历
 */
public class Calendar {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        // 得到一个月的第一天
        date = date.minusDays(today - 1);

        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fir Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
