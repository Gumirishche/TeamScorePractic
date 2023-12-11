package task3.third;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendsTest {

    @Test
    void weekends() {
        assertEquals(0, new Weekends().weekends("2023-11-01","2023-11-01"));
        assertEquals(0, new Weekends().weekends("2023-05-01","2023-05-03"));
        assertEquals(1, new Weekends().weekends("2023-01-01","2023-01-01"));
        assertEquals(1, new Weekends().weekends("2023-05-01","2023-05-06"));
        assertEquals(1, new Weekends().weekends("2023-05-07","2023-05-10"));
        assertEquals(2, new Weekends().weekends("2023-05-01","2023-05-07"));
        assertEquals(2, new Weekends().weekends("2023-05-01","2023-05-08"));
        assertEquals(2, new Weekends().weekends("2023-05-06","2023-05-07"));
        assertEquals(2, new Weekends().weekends("2023-05-06","2023-05-09"));
        assertEquals(4, new Weekends().weekends("2023-05-01","2023-05-16"));
        assertEquals(105, new Weekends().weekends("2023-01-01","2023-12-31"));
        assertEquals(0, new Weekends().weekends("2023-02-01","2023-01-01"));
    }
}