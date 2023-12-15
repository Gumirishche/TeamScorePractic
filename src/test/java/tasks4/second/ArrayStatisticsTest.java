package tasks4.second;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStatisticsTest {

    @Test
    void mode() {
        assertEquals("[1, 4]", Arrays.toString(new ArrayStatistics(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 1}).mode()));
        assertEquals("[]", Arrays.toString(new ArrayStatistics(new int[0]).mode()));
        assertEquals("[2]", Arrays.toString(new ArrayStatistics(new int[]{1, 2, 2}).mode()));
    }

    @Test
    void median() {
        assertEquals(4.5, new ArrayStatistics(new int[]{1, 2, 3, 4, 9, 5, 6, 7, 8, 1}).median());
        assertEquals(0, new ArrayStatistics(new int[0]).median());
        assertEquals(2, new ArrayStatistics(new int[]{1, 2, 2}).median());
    }

    @Test
    void average() {
        assertEquals(4.6, new ArrayStatistics(new int[]{1, 2, 3, 4, 9, 5, 6, 7, 8, 1}).average());
        assertEquals(0, new ArrayStatistics(new int[0]).average());
        assertEquals(1.7, new ArrayStatistics(new int[]{1, 2, 2}).average());
    }

    @Test
    void variance() {
        assertEquals(7.4, new ArrayStatistics(new int[]{1, 2, 3, 4, 9, 5, 6, 7, 8, 1}).variance());
        assertEquals(0, new ArrayStatistics(new int[0]).variance());
        assertEquals(0.2, new ArrayStatistics(new int[]{1, 2, 2}).variance());
    }

    @Test
    void geometricMean() {
        assertEquals(3.6, new ArrayStatistics(new int[]{1, 2, 3, 4, 9, 5, 6, 7, 8, 1}).geometricMean());
        assertEquals(0, new ArrayStatistics(new int[0]).geometricMean());
        assertEquals(1.6, new ArrayStatistics(new int[]{1, 2, 2}).geometricMean());
    }
}