package task3.fourth;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateOfFirstAndLastWeek {

    public LocalDate[] firstWeekOfYear(LocalDate date) {
        LocalDate dateOfFirstMondayOfYear = date.withDayOfMonth(1).withMonth(1);
        while (!dateOfFirstMondayOfYear.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            dateOfFirstMondayOfYear = dateOfFirstMondayOfYear.plusDays(1);
        }
        LocalDate dateOfFirstSundayOfYear = dateOfFirstMondayOfYear.plusDays(6);
        return new LocalDate[]{dateOfFirstMondayOfYear, dateOfFirstSundayOfYear};
    }

    public LocalDate[] lastWeekOfYear(LocalDate date) {
        LocalDate lastMondayOfYear = date.withMonth(12).withDayOfMonth(31);
        while (!lastMondayOfYear.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            lastMondayOfYear = lastMondayOfYear.minusDays(1);
        }
        LocalDate lastSundayOfYear = lastMondayOfYear.plusDays(6);
        return new LocalDate[]{lastMondayOfYear, lastSundayOfYear};
    }

    public LocalDate[] weekOfNumber(int number, LocalDate date) {
        LocalDate[] firstWeekOfYear = new DateOfFirstAndLastWeek().firstWeekOfYear(date);
        LocalDate[] lastWeekOfYear = new DateOfFirstAndLastWeek().lastWeekOfYear(date);
        LocalDate mondayOfNumber = firstWeekOfYear[0].plusDays(7L * (number - 1));
        if (mondayOfNumber.isAfter(lastWeekOfYear[0])) {
            return lastWeekOfYear;
        } else {
            return new LocalDate[]{mondayOfNumber, mondayOfNumber.plusDays(6)};
        }
    }

    public static void main(String[] args) {
        //System.out.println(LocalDate.from(DateTimeFormatter.ISO_WEEK_DATE.parse("2024-02-1")));
        String str = "2024-W15-1";
        int c = Integer.parseInt(str.toCharArray()[6] + "" + str.toCharArray()[7]);
        System.out.println(c);
        //System.out.println(LocalDate.parse("2024-W02-1"));
        //System.out.println(Arrays.toString(new DateOfFirstAndLastWeek().firstWeekOfYear(LocalDate.parse("2023-08-15"))));
        //new DateOfFirstAndLastWeek().lastWeekOfYear(LocalDate.parse("2023-11-22"));
        //System.out.println(Arrays.toString(new DateOfFirstAndLastWeek().weekOfNumber(1000, LocalDate.parse("2023-11-22"))));
    }
}
