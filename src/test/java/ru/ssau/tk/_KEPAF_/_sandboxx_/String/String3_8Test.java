package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_8Test {
    @Test
    public void testIndexof() {
        assertEquals(String3_8.indexof("String", "Str"), -1);
        assertEquals(String3_8.indexof("Kno pa", "pa"),4);

    }

}