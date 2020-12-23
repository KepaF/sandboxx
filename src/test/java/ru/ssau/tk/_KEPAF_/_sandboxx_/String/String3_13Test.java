package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_13Test {
    @Test
    public void test() {
        String str = "Understandable have a nice day";
        int maxSizeStr = str.length();
        assertEquals(String3_13.getStringOfIndex(str, -2, maxSizeStr), str);
        assertEquals(String3_13.getStringOfIndex(str, 2, maxSizeStr), str.substring(2));
        assertEquals(String3_13.getStringOfIndex(str, -2, 14), str.substring(0, 14));
        assertEquals(String3_13.getStringOfIndex(str, 2, 14), str.substring(2, 14));
    }
}