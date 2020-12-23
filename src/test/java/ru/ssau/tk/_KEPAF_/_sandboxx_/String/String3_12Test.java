package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_12Test {
    @Test
    public void testSet() {
        assertEquals(new String3_12().set("opopopopo", "opo", "po"), "popppo");
    }

}