package ru.ssau.tk._KEPAF_._sandboxx_.Operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    private static final double DELTA = 0.00001;
    private final Operation a = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(a.apply(Math.PI/4), 1, DELTA);
        assertEquals(a.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(a.apply(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(a.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(a.applyTriple(Math.PI/4), Math.tan(Math.tan(Math.tan(Math.PI/4))), DELTA);
        assertEquals(a.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(a.applyTriple(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(a.applyTriple(Double.NaN), Double.NaN, DELTA);
    }

}