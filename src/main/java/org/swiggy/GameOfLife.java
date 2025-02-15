package org.swiggy;

public class GameOfLife {
    private final Grid grid;
    public GameOfLife(int rows, int cols, int initialAliveCells) {
        this.grid = new Grid(rows, cols);
        this.grid.seed(initialAliveCells);
    }

}
