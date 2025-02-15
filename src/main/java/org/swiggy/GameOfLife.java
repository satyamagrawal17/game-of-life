package org.swiggy;

public class GameOfLife {
    private final int rows;
    private final int cols;
    public GameOfLife(int rows, int cols, double numberOfSeeds) {
        if(rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows & Cols can only be positive");
        }
        if(numberOfSeeds <= 0 || numberOfSeeds > rows * cols) {
            throw new IllegalArgumentException("Number of Seeds cannot be negative");
        }
        this.rows = rows;
        this.cols = cols;
    }

}
