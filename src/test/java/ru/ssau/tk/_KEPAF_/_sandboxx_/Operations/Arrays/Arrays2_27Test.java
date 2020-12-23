package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_27Test {

    @Test
    public void testGetNumber() {
        assertEquals(Arrays2_27.isEven(new int[]{1,2,3,4}), new boolean[]{false,true,false,true});
    }

}