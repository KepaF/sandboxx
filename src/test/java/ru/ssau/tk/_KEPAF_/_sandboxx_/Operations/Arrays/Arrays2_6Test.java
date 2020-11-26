package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_6Test {
    @Test
    public void testSetNumber() {
        int[] array = Arrays2_6.setNumber(10);
        assertEquals(array[1], 1);
        assertEquals(array[6], 36);
        assertEquals(array[2], 4);
        assertNotEquals(array[2], 0);
    }
}