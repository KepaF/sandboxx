package ru.ssau.tk._KEPAF_._sandboxx_.String;

public class String3_4 {
    static boolean palindromeCheck(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
