package c4;

import java.time.LocalDate;

/**
 * @author lanqilu
 * @date Created in 2020/09/26  15:26
 * @description
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        LocalDate birthday = LocalDate.of(2000, 9, 7);

        int year = birthday.getYear();
        int monthValue = birthday.getMonthValue();
        int dayOfMonth = birthday.getDayOfMonth();

        LocalDate localDate = birthday.plusDays(1000);
        int value = localDate.getYear();

        System.out.println("year = " + year);
        System.out.println("monthValue = " + monthValue);
        System.out.println("dayOfMonth = " + dayOfMonth);
        System.out.println("value = " + value);
    }
}
