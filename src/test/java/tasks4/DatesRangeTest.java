package tasks4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DatesRangeTest {

    @Test
    void datesRange() {
        assertEquals("[]", Arrays.toString(DatesRange.datesRange("2023-11-12", "2023-11-11")));
        assertEquals(0, DatesRange.datesRange("2023-11-12", "2023-11-11").length);
        assertEquals("[2023-02-28]", Arrays.toString(DatesRange.datesRange("2023-02-28", "2023-02-28")));
        assertEquals(1, DatesRange.datesRange("2023-02-28", "2023-02-28").length);
        assertEquals("[2020-05-28, 2020-05-29, 2020-05-30, 2020-05-31, 2020-06-01, 2020-06-02]", Arrays.toString(DatesRange.datesRange("2020-05-28", "2020-06-02")));
        assertEquals(6, DatesRange.datesRange("2020-05-28", "2020-06-02").length);
        assertEquals(365, DatesRange.datesRange("1901-01-01", "1901-12-31").length);
    }
}