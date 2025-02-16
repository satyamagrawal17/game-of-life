package org.swiggy;

public class GameOfLife {
    private final Grid grid;
    public GameOfLife(int rows, int cols, int initialAliveCells) {
        this.grid = new Grid(rows, cols);
        this.grid.seed(initialAliveCells);
    }

    public void start() {
        System.out.println("Game started");
        int generation = 0;
        while(!grid.hasAliveCells(0)) {
            grid.nextGeneration();
            generation++;
            System.out.println("Current Generation: " + generation);
        }
        System.out.println("Game ended at generation: " + generation);
    }

    public void next() {
        if(grid.hasAliveCells(0)) {
            throw new IllegalStateException("Game has ended");
        }
        grid.nextGeneration();
    }

    public void reset() {
        grid.reset();
    }

    public boolean hasGeneration(int generation) {
        return grid.hasGeneration(generation);
    }

    public boolean hasMinimumGeneration(int minGeneration) {
        return grid.hasMinimumGeneration(minGeneration);
    }



}
