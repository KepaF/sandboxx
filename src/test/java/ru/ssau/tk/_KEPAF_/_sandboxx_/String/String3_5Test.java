package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_5Test {
    @Test
    public void testDifferentStr() {
        String _1str = "HELLO WORLD";
        String _2str = "hello world";
        String _3str = "YES";
        assertTrue(String3_5.differentStr(_1str, _2str));
        assertFalse(String3_5.differentStr(_2str, _2str));
        assertFalse(String3_5.differentStr(_2str, _3str));
        assertFalse(String3_5.differentStr(null, _2str));
        assertFalse(String3_5.differentStr(_1str, null));
        assertFalse(String3_5.differentStr(null, null));
    }

}