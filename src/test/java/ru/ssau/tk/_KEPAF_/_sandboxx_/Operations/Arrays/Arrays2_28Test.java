package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_28Test {
    @Test
    public void testLongToInt() {
        assertEquals(Arrays2_28.intToLong(Arrays2_28.longToInt(1095L)), 1095L);
        assertEquals(Arrays2_28.intToLong(Arrays2_28.longToInt(9L)), 9L);
    }

}