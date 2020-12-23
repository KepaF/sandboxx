package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_21Test {

    @Test
    public void testGetNumber() {
        int[] array = new int[]{1,2,3,3,2,1,3};
        assertEquals(Arrays2_21.getNumber(array),3);
        int[] temp = new int[]{1,1,1,1,0,0,0,-1};
        assertEquals(Arrays2_21.getNumber(temp),1);
    }
}