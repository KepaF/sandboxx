package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_20Test {
    @Test
    public void testGetUnifiedStr() {
        String[] str = {"Understandable", "have", "a", "nice", "day"};
        assertEquals(String3_20.getUnifiedStr(str), "Understandable, have, a, nice, day");
    }

}