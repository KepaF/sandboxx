package ru.ssau.tk._KEPAF_._sandboxx_.String;

public class String3_12 {
    static String set(String _1str, String _2str, String _3str) {
        for (int i = 0; i < 100 && _1str.contains(_2str); i++) {
            _1str = _1str.replaceAll(_2str, _3str);
        }
        return _1str;
    }
}
