package ru.ssau.tk._KEPAF_._sandboxx_.Operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    private static final double DELTA = 0.00001;
    private final Operation a = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(a.apply(121), 11, DELTA);
        assertEquals(a.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(a.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(a.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(a.applyTriple(144), 1.861209, DELTA);
        assertEquals(a.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(a.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(a.applyTriple(Double.NaN), Double.NaN, DELTA);
    }

}