package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_5Test {
    @Test
    public void testSetNumber() {
        int[] array = Arrays2_5.setNumber(10);
        assertEquals(array[6],8);
        assertEquals(array[1],1);
        assertEquals(array[2],1);
        assertEquals(array[9],34);
        assertEquals(array[10],55);
    }

}