package task3.fourth;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FormatterDateTest {

    @Test
    void checkingTheDate() {
        assertEquals(LocalDate.now(),new FormatterDate().checkingTheDate("gjdhg"));
        assertEquals(LocalDate.parse("2023-01-13"),new FormatterDate().checkingTheDate("2023-W02-5"));
        assertEquals(LocalDate.parse("2023-01-20"),new FormatterDate().checkingTheDate("2023-W03-5"));
    }

    @Test
    void weekRange() {
        assertEquals("(2023-01-02 - 2023-01-08)",new FormatterDate().weekRange("2023-W01-5"));
        assertEquals("(2024-01-01 - 2024-01-07)",new FormatterDate().weekRange("2024-W01-5"));
    }
}