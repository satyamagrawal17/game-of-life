package org.swiggy;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        System.out.print("Enter number of initial alive cells: ");
        int initialAliveCells = scanner.nextInt();
        GameOfLife gameOfLife = new GameOfLife(rows, columns, initialAliveCells);
        gameOfLife.start();
    }
}