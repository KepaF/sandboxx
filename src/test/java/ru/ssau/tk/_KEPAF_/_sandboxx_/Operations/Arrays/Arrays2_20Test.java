package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_20Test {
    @Test
    public void testSetArray() {
        int[] array = new int[]{3, 6, 9, 12, 15, 21, 6};
        assertTrue(Arrays2_20.setArray(array));
        int[] _1array = new int[]{20,3,6,9,12,15,21,3};
        assertFalse(Arrays2_20.setArray(_1array));
    }

}