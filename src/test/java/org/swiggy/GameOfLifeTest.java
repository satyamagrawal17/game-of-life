package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {
    @Test
    void testSuccessfullyGameCreation() {
        int rows = 5;
        int cols = 5;
        double seedPercentage = 10;
        GameOfLife gameOfLife = new GameOfLife(rows, cols, seedPercentage);
    }

    @Test
    void testGameCreationReturnExceptionWhenNegativeRows() {
        int rows = -5;
        int cols = 5;
        double seedPercentage = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, seedPercentage));
    }

    @Test
    void testGameCreationReturnExceptionWhenZeroRows() {
        int rows = 0;
        int cols = 5;
        double seedPercentage = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, seedPercentage));
    }

    @Test
    void testGameCreationReturnExceptionWhenNegativeCols() {
        int rows = 5;
        int cols = -5;
        double seedPercentage = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, seedPercentage));
    }
    @Test
    void testGameCreationReturnExceptionWhenZeroCols() {
        int rows = 5;
        int cols = 0;
        double seedPercentage = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, seedPercentage));
    }

}