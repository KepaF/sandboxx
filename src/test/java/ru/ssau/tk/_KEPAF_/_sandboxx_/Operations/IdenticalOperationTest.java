package ru.ssau.tk._KEPAF_._sandboxx_.Operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private static final double DELTA = 0.00001;
    private final Operation a = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(a.apply(120), 120, DELTA);
        assertEquals(a.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(a.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(a.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(a.applyTriple(50), 50, DELTA);
        assertEquals(a.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(a.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(a.applyTriple(Double.NaN), Double.NaN, DELTA);
    }

}