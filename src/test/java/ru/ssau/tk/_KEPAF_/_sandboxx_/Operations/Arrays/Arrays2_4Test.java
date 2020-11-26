package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_4Test {
    @Test
    public void testSetNumber() {
        int[] array = Arrays2_4.setNumber(10);
        for (int i = 0; i < 10; i++) {
            assertEquals(array[i], 20-2*i);
        }
    }
}