package tasks4.first;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DatesRange {
    public static LocalDate[] datesRange(String dateString1, String dateString2) {
        LocalDate date1 = LocalDate.parse(dateString1);
        LocalDate date2 = LocalDate.parse(dateString2);
        if (date1.isAfter(date2)) {
            return new LocalDate[]{};
        } else {
            int daysCount = (int) date1.until(date2, ChronoUnit.DAYS);
            LocalDate[] dates = new LocalDate[daysCount + 1];
            LocalDate date = date1;
            for (int i = 0; i < dates.length; i++) {
                dates[i] = date;
                if (date.isEqual(date2)) {
                    break;
                }
                date = date.plusDays(1);
            }
            return dates;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(DatesRange.datesRange("2023-02-28", "2023-02-28")));
    }
}
