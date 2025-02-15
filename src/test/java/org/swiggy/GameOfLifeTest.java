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




}