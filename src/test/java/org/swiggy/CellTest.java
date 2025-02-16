package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {
    @Test
    void testCellCreationSuccessfully() {
        Cell cell = new Cell();
        assertNotNull(cell);
    }

}