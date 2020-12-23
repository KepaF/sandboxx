package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import java.util.Arrays;

public class Arrays2_32 {
    static void sort(Double[] array) {
        for (Double j : array) {
            if (j.isNaN()) {
                return;
            } else {
                Arrays.sort(array);
            }
        }
    }
}
