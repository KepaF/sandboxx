package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_18Test {
    @Test
    public void testMaxvalue() {
        int[] array = new int[]{121, 43, 81, 22, 6};
        assertNull(Arrays2_18.Maxvalue(new int[]{}), null);

    }
}