package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_32Test {
    @Test
    public void testSort() {
        Double[] array = new Double[]{Double.NaN,1.,2.};
        Arrays2_32.sort(array);
        assertEquals(array[1].doubleValue(),1.);
        assertEquals(array[0].doubleValue(),Double.NaN);
    }
}