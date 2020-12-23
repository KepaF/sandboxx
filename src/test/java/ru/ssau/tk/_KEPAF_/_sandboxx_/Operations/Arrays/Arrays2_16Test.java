package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_16Test {
    @Test
    public void testSetFunction() {
        Integer[] array = new Integer[2];
        array[1] = null;
        array[0] = 1;
        assertTrue(Arrays2_16.setFunction(array));
    }

}