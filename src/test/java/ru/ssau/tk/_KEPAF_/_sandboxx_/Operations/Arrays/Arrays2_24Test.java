package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_24Test {

    @Test
    public void testGetNot() {
        int[] array = new int[]{1,2,3,4,5};
        Arrays2_24.getNot(array);
        assertEquals(array[0],-2);
        Arrays2_24.getNot(array);
        assertEquals(array[0],1);
    }

}