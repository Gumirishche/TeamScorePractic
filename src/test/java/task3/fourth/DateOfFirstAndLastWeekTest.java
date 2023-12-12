package task3.fourth;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateOfFirstAndLastWeekTest {

    @Test
    void firstWeekOfYear() {
        assertEquals(LocalDate.parse("2023-01-02")
                ,new DateOfFirstAndLastWeek().firstWeekOfYear(LocalDate.parse("2023-08-15"))[0]);
        assertEquals(LocalDate.parse("2023-01-08")
                ,new DateOfFirstAndLastWeek().firstWeekOfYear(LocalDate.parse("2023-08-15"))[1]);
        assertEquals(LocalDate.parse("2024-01-01")
                ,new DateOfFirstAndLastWeek().firstWeekOfYear(LocalDate.parse("2024-08-15"))[0]);
        assertEquals(LocalDate.parse("2024-01-07")
                ,new DateOfFirstAndLastWeek().firstWeekOfYear(LocalDate.parse("2024-08-15"))[1]);
        assertEquals(LocalDate.parse("2022-01-03")
                ,new DateOfFirstAndLastWeek().firstWeekOfYear(LocalDate.parse("2022-08-15"))[0]);
        assertEquals(LocalDate.parse("2022-01-09")
                ,new DateOfFirstAndLastWeek().firstWeekOfYear(LocalDate.parse("2022-08-15"))[1]);
    }

    @Test
    void lastWeekOfYear() {
        assertEquals(LocalDate.parse("2023-12-25")
                ,new DateOfFirstAndLastWeek().lastWeekOfYear(LocalDate.parse("2023-08-15"))[0]);
        assertEquals(LocalDate.parse("2023-12-31")
                ,new DateOfFirstAndLastWeek().lastWeekOfYear(LocalDate.parse("2023-08-15"))[1]);
        assertEquals(LocalDate.parse("2024-12-30")
                ,new DateOfFirstAndLastWeek().lastWeekOfYear(LocalDate.parse("2024-08-15"))[0]);
        assertEquals(LocalDate.parse("2025-01-05")
                ,new DateOfFirstAndLastWeek().lastWeekOfYear(LocalDate.parse("2024-08-15"))[1]);
        assertEquals(LocalDate.parse("2022-12-26")
                ,new DateOfFirstAndLastWeek().lastWeekOfYear(LocalDate.parse("2022-08-15"))[0]);
        assertEquals(LocalDate.parse("2023-01-01")
                ,new DateOfFirstAndLastWeek().lastWeekOfYear(LocalDate.parse("2022-08-15"))[1]);
    }

    @Test
    void weekOfNumber() {
        assertEquals(LocalDate.parse("2023-04-10")
                ,new DateOfFirstAndLastWeek().weekOfNumber(15,LocalDate.parse("2023-08-15"))[0]);
        assertEquals(LocalDate.parse("2023-04-16")
                ,new DateOfFirstAndLastWeek().weekOfNumber(15,LocalDate.parse("2023-08-15"))[1]);
        assertEquals(LocalDate.parse("2024-01-01")
                ,new DateOfFirstAndLastWeek().weekOfNumber(1,LocalDate.parse("2024-08-15"))[0]);
        assertEquals(LocalDate.parse("2024-01-07")
                ,new DateOfFirstAndLastWeek().weekOfNumber(1,LocalDate.parse("2024-08-15"))[1]);
        assertEquals(LocalDate.parse("2022-02-21")
                ,new DateOfFirstAndLastWeek().weekOfNumber(8,LocalDate.parse("2022-08-15"))[0]);
        assertEquals(LocalDate.parse("2022-02-27")
                ,new DateOfFirstAndLastWeek().weekOfNumber(8,LocalDate.parse("2022-08-15"))[1]);
    }
}