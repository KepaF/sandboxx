package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_29 {
    static int[] getArray(int size, int indexBegining) {
        if (indexBegining >= size) {
            return null;
        } else {
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i + indexBegining - (i + indexBegining >= size ? size : 0)] = i + 1;
            }
            return result;
        }
    }
}
