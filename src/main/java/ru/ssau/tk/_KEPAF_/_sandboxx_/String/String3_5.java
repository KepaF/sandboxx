package ru.ssau.tk._KEPAF_._sandboxx_.String;

import java.util.Objects;

public class String3_5 {
    static boolean differentStr(String _1str, String _2str) {
        return !Objects.equals(null, _1str) && !Objects.equals(null, _2str)
                && !_1str.equals(_2str)
                && _1str.equalsIgnoreCase(_2str);
    }
}
