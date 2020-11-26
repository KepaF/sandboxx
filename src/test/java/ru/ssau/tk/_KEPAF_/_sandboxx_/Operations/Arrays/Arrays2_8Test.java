package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_8Test {
    @Test
    public void testSetNumber() {
        final double DELTA = 0.00001;
        double[] array = Arrays2_8.setNumber(11);
        assertEquals(array[0], 1, DELTA);
        assertEquals(array[2], 4, DELTA);
        assertEquals(array[3], 5, DELTA);
        assertEquals(array[4], 7, DELTA);
        assertEquals(array[5], 8, DELTA);
        assertEquals(array[6], 10, DELTA);
        assertNotEquals(array[6], 0, DELTA);
    }
}