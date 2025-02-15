package org.swiggy;

public class GameOfLife {
    private final int rows;
    private final int cols;
    public GameOfLife(int rows, int cols, double seedPercentage) {
        if(rows <= 0) {
            throw new IllegalArgumentException("Rows can only be positive");
        }
        this.rows = rows;
        this.cols = cols;
    }

}
