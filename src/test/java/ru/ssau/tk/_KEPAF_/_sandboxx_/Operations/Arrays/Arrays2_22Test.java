package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_22Test {
    @Test
    public void testGetIndexOftenNumber() {
        int[] array = new int[]{1,2,3,4,5,6,7};
        assertEquals(Arrays2_22.getIndexOftenNumber(array,1),0);
        assertEquals(Arrays2_22.getIndexOftenNumber(array,3),2);
        assertEquals(Arrays2_22.getIndexOftenNumber(array,7),6);
    }

}