package task3.third;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Weekends {


    public int weekends(String strDate1, String strDate2) {
        LocalDate date1 = LocalDate.parse(strDate1);
        LocalDate date2 = LocalDate.parse(strDate2);
        LocalDate date = date1;
        int countOfWeekends = 0;
        if (!date1.isAfter(date2)) {
            while (!date.isEqual(date2.plusDays(1))) {
                if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                    countOfWeekends++;
                }
                date = date.plusDays(1);
            }
        } else {
            System.out.println("2-я дата раньше, чем 1-я");
        }
        return countOfWeekends;
    }
}
