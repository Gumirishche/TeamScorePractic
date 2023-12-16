package tasks4.third.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    void findLowestPrice() {
        Algorithm algorithm = new Algorithm();
        assertEquals(2, algorithm.findLowestPrice(6));
        assertEquals(3, algorithm.findLowestPrice(0));
    }

    @Test
    void findLowestCost() {
        Algorithm algorithm = new Algorithm();
        assertEquals(2, algorithm.findLowestCost(3));
        assertEquals(2, algorithm.findLowestCost(2));
    }
}