package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_30 {
    static int[][] getVector(int size) {
        int[][] array = new int[size][];
        int k = 1;
        for (int i = 0; i < size; i++) {
            array[i] = new int[size - i];
            for (int j = 0; j < size - i; j++) {
                array[i][j] = k;
                k++;
            }
        }
        return array;
    }
}
