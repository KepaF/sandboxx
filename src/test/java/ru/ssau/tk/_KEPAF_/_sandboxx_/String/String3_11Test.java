package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_11Test {
    @Test
    public void testTheNumberOfStringArray() {
        String[] array = new String[]{"Understandble", "have", " a ", "nice ", " day"};
        assertEquals(String3_11.theNumberOfStringArray(array, "h", "e"), 1);
        assertEquals(String3_11.theNumberOfStringArray(array,"d","y"),1);
    }

}