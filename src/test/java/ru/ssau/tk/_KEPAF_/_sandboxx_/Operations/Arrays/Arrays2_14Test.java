package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_14Test {
    @Test
    public void testSetArray() {
        int array[] = new int[]{1, 2,-3};
        Arrays2_14.setArray(array);
        assertEquals((array[0]), -1);
        assertEquals((array[1]), -2);
        assertEquals(array[2],3);
    }

}