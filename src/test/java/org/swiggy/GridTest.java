package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {
    @Test
    void testGridCreationReturnExceptionWhenNegativeRows() {
        int rows = -5;
        int cols = 5;
        assertThrows(IllegalArgumentException.class, () -> new Grid(rows, cols));
    }

    @Test
    void testGridCreationReturnExceptionWhenZeroRows() {
        int rows = 0;
        int cols = 5;
        assertThrows(IllegalArgumentException.class, () -> new Grid(rows, cols));
    }

    @Test
    void testGridCreationReturnNoExceptionWhenPositiveRows() {
        int rows = 5;
        int cols = 5;
        assertDoesNotThrow(() -> new Grid(rows, cols));
    }

    @Test
    void testGridCreationReturnExceptionWhenNegativeCols() {
        int rows = 5;
        int cols = -5;
        assertThrows(IllegalArgumentException.class, () -> new Grid(rows, cols));
    }
    @Test
    void testGridCreationReturnExceptionWhenZeroCols() {
        int rows = 5;
        int cols = 0;
        assertThrows(IllegalArgumentException.class, () -> new Grid(rows, cols));
    }

    @Test
    void testGridCreationReturnNoExceptionWhenPositiveCols() {
        int rows = 5;
        int cols = 5;
        assertDoesNotThrow(() -> new Grid(rows, cols));
    }

    @Test
    void testGridSeedReturnExceptionWhenNegativeNumberOfSeeds() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = -10;
        Grid grid = new Grid(rows, cols);
        assertThrows(IllegalArgumentException.class, () -> grid.seed(initialAliveCells));
    }

    @Test
    void testGridSeedReturnExceptionWhenZeroNumberOfSeeds() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 0;
        Grid grid = new Grid(rows, cols);
        assertThrows(IllegalArgumentException.class, () -> grid.seed(initialAliveCells));
    }

    @Test
    void testGridSeedReturnExceptionWhenNumberOfSeedsGreaterThanLimit() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 110;
        Grid grid = new Grid(rows, cols);
        assertThrows(IllegalArgumentException.class, () -> grid.seed(initialAliveCells));
    }

    @Test
    void testGameCreationReturnNoExceptionWhenPositiveNumberOfSeedsWithinLimit() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 10;
        Grid grid = new Grid(rows, cols);
        assertDoesNotThrow(() -> grid.seed(initialAliveCells));
    }



}