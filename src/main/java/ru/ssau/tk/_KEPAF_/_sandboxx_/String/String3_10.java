package ru.ssau.tk._KEPAF_._sandboxx_.String;

public class String3_10 {
    static int set(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String str: array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}

