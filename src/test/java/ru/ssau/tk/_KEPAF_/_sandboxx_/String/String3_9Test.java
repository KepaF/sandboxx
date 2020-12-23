package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_9Test {
    @Test
    public void testGetIndexOf() {
        assertEquals(String3_9.getIndexOf("Knopa cat", "pa"), 3);
        assertEquals(String3_9.getIndexOf("Hello world", "Hell"), 0);
    }
}