package org.swiggy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Grid {
    private final int rows;
    private final int cols;
    private int generation;
    private int aliveCells;
    List<List<Cell>> cells = new ArrayList<>();

    public Grid(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows and columns should be greater than 0");
        }
        this.rows = rows;
        this.cols = cols;
        this.generation = 0;
        this.aliveCells = 0;
        for (int i = 0; i < rows; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(null);
            }
            this.cells.add(row);
        }
    }

    public void seed(int initialAliveCells) {
        int totalCells = rows * cols;
        if(initialAliveCells <= 0 || initialAliveCells > totalCells) {
            throw new IllegalArgumentException("Number of seeds should be greater than 0 and less than total cells");
        }
        Random random = new Random();
        for (int i = 0; i < initialAliveCells; i++) {
            int randomCell = random.nextInt(totalCells);
            int rowIndex = randomCell / cols;
            int colIndex = randomCell % cols;
            if (cells.get(rowIndex).get(colIndex) == null) {
                cells.get(rowIndex).set(colIndex, new Cell());
                aliveCells++;
            }
            else {
                i--;
            }
        }
    }

    public boolean hasAliveCells(int expectedAliveCells) {
        System.out.println(aliveCells);
        return aliveCells == expectedAliveCells;
    }


    public void nextGeneration() {
        generation++;
        List<List<Cell>> newCells = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(null);
            }
            newCells.add(row);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int aliveNeighbours = getAliveNeighbours(i, j);
                if (cells.get(i).get(j) != null) {
                    if (aliveNeighbours < 2 || aliveNeighbours > 3) {
                        newCells.get(i).set(j, null);
                        aliveCells--;
                    } else {
                        newCells.get(i).set(j, new Cell());
                    }
                } else {
                    if (aliveNeighbours == 3) {
                        newCells.get(i).set(j, new Cell());
                        aliveCells++;
                    }
                }
            }
        }
        cells = newCells;
    }

    private int getAliveNeighbours(int rowIndex, int colIndex) {
        int aliveNeighbours = 0;
        for(EDirection dir : EDirection.values()) {
            int newRow = rowIndex + dir.getDx();
            int newCol = colIndex + dir.getDy();
            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                if (cells.get(newRow).get(newCol) != null) {
                    aliveNeighbours++;
                }
            }
        }
        return aliveNeighbours;
    }
}
