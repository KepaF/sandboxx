package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_29Test {
    @Test
    public void testGetArray() {
        int[] array = Arrays2_29.getArray(5, 3);
        assertEquals(array[0],3);
        assertEquals(array[1],4);
        assertEquals(array[2],5);
        assertEquals(array[3],1);
    }
}