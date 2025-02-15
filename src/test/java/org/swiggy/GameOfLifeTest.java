package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {
    @Test
    void testSuccessfullyGameCreation() {
        int rows = 5;
        int cols = 5;
        double numberOfSeeds = 10;
        GameOfLife gameOfLife = new GameOfLife(rows, cols, numberOfSeeds);
    }

    @Test
    void testGameCreationReturnExceptionWhenNegativeRows() {
        int rows = -5;
        int cols = 5;
        double numberOfSeeds = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, numberOfSeeds));
    }

    @Test
    void testGameCreationReturnExceptionWhenZeroRows() {
        int rows = 0;
        int cols = 5;
        double numberOfSeeds = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, numberOfSeeds));
    }

    @Test
    void testGameCreationReturnNoExceptionWhenPositiveRows() {
        int rows = 5;
        int cols = 5;
        double numberOfSeeds = 10;
        assertDoesNotThrow(() -> new GameOfLife(rows, cols, numberOfSeeds));
    }

    @Test
    void testGameCreationReturnExceptionWhenNegativeCols() {
        int rows = 5;
        int cols = -5;
        double numberOfSeeds = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, numberOfSeeds));
    }
    @Test
    void testGameCreationReturnExceptionWhenZeroCols() {
        int rows = 5;
        int cols = 0;
        double numberOfSeeds = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, numberOfSeeds));
    }

    @Test
    void testGameCreationReturnNoExceptionWhenPositiveCols() {
        int rows = 5;
        int cols = 5;
        double numberOfSeeds = 10;
        assertDoesNotThrow(() -> new GameOfLife(rows, cols, numberOfSeeds));
    }

    @Test
    void testGameCreationReturnExceptionWhenNegativeNumberOfSeeds() {
        int rows = 5;
        int cols = 5;
        double numberOfSeeds = -10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, numberOfSeeds));
    }

    @Test
    void testGameCreationReturnExceptionWhenZeroNumberOfSeeds() {
        int rows = 5;
        int cols = 5;
        double numberOfSeeds = 0;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, numberOfSeeds));
    }

    @Test
    void testGameCreationReturnExceptionWhenNumberOfSeedsGreaterThanLimit() {
        int rows = 5;
        int cols = 5;
        double numberOfSeeds = 110;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, numberOfSeeds));
    }

    @Test
    void testGameCreationReturnNoExceptionWhenPositiveNumberOfSeedsWithinLimit() {
        int rows = 5;
        int cols = 5;
        double numberOfSeeds = 10;
        assertDoesNotThrow(() -> new GameOfLife(rows, cols, numberOfSeeds));
    }

}