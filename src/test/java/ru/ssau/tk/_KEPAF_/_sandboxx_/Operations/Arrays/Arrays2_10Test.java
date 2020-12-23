package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_10Test {
    @Test
    public void testGetGeometricProgression() {
        double[] array = Arrays2_10.getGeometricProgression(2, 2, 11);
        assertEquals(array[5], 64, 0.00001);
    }

}