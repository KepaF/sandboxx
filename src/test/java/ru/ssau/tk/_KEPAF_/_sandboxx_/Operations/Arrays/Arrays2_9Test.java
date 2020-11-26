package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_9Test {
    @Test
    public void testSetfunction() {
        double DELTA = 0.00001;
        int[] array = Arrays2_9.setfunction(1, 3, 11);
        assertEquals(array[0], 1, DELTA);
        assertEquals(array[2], 7, DELTA);
        assertEquals(array[8], 25, DELTA);
        assertNotEquals(array[2], 0, DELTA);
    }
}