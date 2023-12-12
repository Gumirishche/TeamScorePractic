package task3.fourth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FormatterDate {

    private int numberOfWeek = 0;

    public LocalDate checkingTheDate(String str) {
        try {
            LocalDate date = LocalDate.from(DateTimeFormatter.ISO_WEEK_DATE.parse(str));
            numberOfWeek = Integer.parseInt(str.toCharArray()[6] + "" + str.toCharArray()[7]);
            return date;
        } catch (DateTimeParseException e) {
            System.err.println("Введены некорректные данные. Шаблон: 'гггг-Wнн-д'; (нн-номер недели, д-номер дня в неделе)");
        }
        return LocalDate.now();
    }

    public String weekRange(String str) {
        LocalDate date = checkingTheDate(str);
        DateOfFirstAndLastWeek date1 = new DateOfFirstAndLastWeek();
        LocalDate[] dates = date1.weekOfNumber(numberOfWeek, date);
        return "(" + dates[0] + " - " + dates[1] + ")";
    }
}
