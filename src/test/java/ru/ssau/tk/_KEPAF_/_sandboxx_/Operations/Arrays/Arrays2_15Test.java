package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_15Test {
    @Test
    public void testSetArray() {
        int[] arr = {1,2,3};
        assertEquals(Arrays2_15.setArray(arr,3),true);
        assertEquals(Arrays2_15.setArray(arr,-1),false);
    }
}