package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_16 {
    static boolean setFunction(Integer[] array) {
        for (int i : array) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }
}

