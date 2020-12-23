package ru.ssau.tk._KEPAF_._sandboxx_.String;

public class String3_13 {
    static String getStringOfIndex(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (from == to) {
            return "";
        }
        return str.substring(from, to);
    }
}
