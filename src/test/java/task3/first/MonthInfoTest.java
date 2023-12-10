package task3.first;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthInfoTest {

    @Test
    void nameOfMonth() {
        assertEquals("ноябрь", new MonthInfo("2023-11-12").nameOfMonth());
        assertEquals("январь", new MonthInfo("1900-01-01").nameOfMonth());
        assertEquals("февраль", new MonthInfo("2020-02-12").nameOfMonth());
    }

    @Test
    void numberOfMonth() {
        assertEquals("11", new MonthInfo("2023-11-12").numberOfMonth());
        assertEquals("1", new MonthInfo("1900-01-01").numberOfMonth());
        assertEquals("2", new MonthInfo("2020-02-12").numberOfMonth());
    }

    @Test
    void firstDayOfMouth() {
        assertEquals("ср", new MonthInfo("2023-11-12").firstDayOfMouth());
        assertEquals("пн", new MonthInfo("1900-01-01").firstDayOfMouth());
        assertEquals("сб", new MonthInfo("2020-02-12").firstDayOfMouth());
    }

    @Test
    void lastDayOfMouth() {
        assertEquals("2023-11-30", new MonthInfo("2023-11-12").lastDayOfMouth());
        assertEquals("1900-01-31", new MonthInfo("1900-01-01").lastDayOfMouth());
        assertEquals("2020-02-29", new MonthInfo("2020-02-12").lastDayOfMouth());
    }

    @Test
    void countDayOfMouth() {
        assertEquals(30, new MonthInfo("2023-11-12").countDayOfMouth());
        assertEquals(31, new MonthInfo("1900-01-01").countDayOfMouth());
        assertEquals(29, new MonthInfo("2020-02-12").countDayOfMouth());
    }

    @Test
    void quarterOfYear() {
        assertEquals("2023 Q4", new MonthInfo("2023-11-12").quarterOfYear());
        assertEquals("1900 Q1", new MonthInfo("1900-01-01").quarterOfYear());
        assertEquals("2020 Q1", new MonthInfo("2020-02-12").quarterOfYear());
    }
}