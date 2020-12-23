package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_4Test {
    @Test
    public void testPalindromeCheck() {
        assertEquals(String3_4.palindromeCheck("andna"),true);
        assertEquals(String3_4.palindromeCheck("notIsPalindrome"),false);
        assertEquals(String3_4.palindromeCheck("i"),true);
    }

}