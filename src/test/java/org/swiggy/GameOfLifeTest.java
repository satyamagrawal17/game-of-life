package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {
    @Test
    void testSuccessfullyGameCreation() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 10;
        GameOfLife gameOfLife = new GameOfLife(rows, cols, initialAliveCells);
    }

    @Test
    void testGameCreationReturnExceptionWhenNegativeRows() {
        int rows = -5;
        int cols = 5;
        int initialAliveCells = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, initialAliveCells));
    }

    @Test
    void testGameCreationReturnExceptionWhenZeroRows() {
        int rows = 0;
        int cols = 5;
        int initialAliveCells = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, initialAliveCells));
    }

    @Test
    void testGameCreationReturnNoExceptionWhenPositiveRows() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 10;
        assertDoesNotThrow(() -> new GameOfLife(rows, cols, initialAliveCells));
    }

    @Test
    void testGameCreationReturnExceptionWhenNegativeCols() {
        int rows = 5;
        int cols = -5;
        int initialAliveCells = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, initialAliveCells));
    }
    @Test
    void testGameCreationReturnExceptionWhenZeroCols() {
        int rows = 5;
        int cols = 0;
        int initialAliveCells = 10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, initialAliveCells));
    }

    @Test
    void testGameCreationReturnNoExceptionWhenPositiveCols() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 10;
        assertDoesNotThrow(() -> new GameOfLife(rows, cols, initialAliveCells));
    }

    @Test
    void testGameCreationReturnExceptionWhenNegativeNumberOfSeeds() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = -10;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, initialAliveCells));
    }

    @Test
    void testGameCreationReturnExceptionWhenZeroNumberOfSeeds() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 0;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, initialAliveCells));
    }

    @Test
    void testGameCreationReturnExceptionWhenNumberOfSeedsGreaterThanLimit() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 110;
        assertThrows(IllegalArgumentException.class, () -> new GameOfLife(rows, cols, initialAliveCells));
    }

    @Test
    void testGameCreationReturnNoExceptionWhenPositiveNumberOfSeedsWithinLimit() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 10;
        assertDoesNotThrow(() -> new GameOfLife(rows, cols, initialAliveCells));
    }


    // Test Start Method
    @Test
    void testStartMethodReturnNoExceptionWhenNoAliveCells() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 10;
        GameOfLife gameOfLife = new GameOfLife(rows, cols, initialAliveCells);
        gameOfLife.start();
        assertTrue(gameOfLife.hasMinimumGeneration(1));
    }

    // Test Next Method

    @Test
    void testNextMethodReturnTrueWhenCalledOnce() {
        int rows = 5;
        int cols = 5;
        int initialAliveCells = 10;
        GameOfLife gameOfLife = new GameOfLife(rows, cols, initialAliveCells);
        gameOfLife.next();
        assertTrue(gameOfLife.hasGeneration(1));
    }



}