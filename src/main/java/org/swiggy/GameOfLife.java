package org.swiggy;

public class GameOfLife {
    private final int rows;
    private final int cols;
    public GameOfLife(int rows, int cols, double seedPercentage) {
        if(rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows & Cols can only be positive");
        }
        if(seedPercentage < 0) {
            throw new IllegalArgumentException("Seed percentage cannot be negative");
        }
        this.rows = rows;
        this.cols = cols;
    }

}
