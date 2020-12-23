package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_25Test {
    @Test
    public void testGetArrayNot() {
        int[] array = new int[]{1,2,3,4,5};
        int[] arrayNot = Arrays2_25.getArrayNot(array);
        assertEquals(arrayNot[0],-2);
        assertEquals(array[0],1);

    }

}