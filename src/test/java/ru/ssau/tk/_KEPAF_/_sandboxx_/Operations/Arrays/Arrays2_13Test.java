package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_13Test {

    @Test
    public void testGetArr() {
        int[] arr = Arrays2_13.getArr(11);
        double accuracy = 0.0001;
        assertEquals(arr[0], 1, accuracy);
        assertEquals(arr[10], 1, accuracy);
        assertEquals(arr[1], 2, accuracy);
        assertEquals(arr[9], 2, accuracy);
        assertEquals(arr[5], 6, accuracy);
    }
}