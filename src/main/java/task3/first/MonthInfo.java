package task3.first;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;

public class MonthInfo {

    private final LocalDate date;

    public MonthInfo(String dateString) {
        date = LocalDate.parse(dateString);
    }

    public MonthInfo() {
        this(LocalDate.now().toString());
    }

    public String nameOfMonth() {
        return DateTimeFormatter.ofPattern("LLLL").format(date);
    }

    public String numberOfMonth() {
        return DateTimeFormatter.ofPattern("M").format(date);
    }

    public String firstDayOfMouth() {
        LocalDate dateOfFirstDay = date.withDayOfMonth(1);
        return DateTimeFormatter.ofPattern("E").format(dateOfFirstDay);
    }

    public String lastDayOfMouth() {
        LocalDate dateOfLastDay = date.withDayOfMonth(date.getMonth().length(date.isLeapYear()));
        return dateOfLastDay.toString();
    }

    public int countDayOfMouth() {
        return date.getMonth().length(date.isLeapYear());
    }

    public String quarterOfYear() {
        return date.getYear() + " Q" + date.get(IsoFields.QUARTER_OF_YEAR);
    }
}
