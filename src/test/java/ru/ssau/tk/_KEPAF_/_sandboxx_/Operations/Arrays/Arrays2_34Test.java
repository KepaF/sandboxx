package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_34Test {
    @Test
    public void testMultiply() {
        assertEquals(Arrays2_34.multiply(new Double[]{1., 2., Double.NaN,
                        Double.NEGATIVE_INFINITY,
                        Double.POSITIVE_INFINITY}).doubleValue(),
                10.);
    }

}