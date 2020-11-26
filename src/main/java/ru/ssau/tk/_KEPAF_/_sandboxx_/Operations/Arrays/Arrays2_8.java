package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_8 {
    static double[] setNumber(int size) {
        double[] array = new double[size];
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            array[i] = j;
            j++;
        }
        return array;
    }
}
