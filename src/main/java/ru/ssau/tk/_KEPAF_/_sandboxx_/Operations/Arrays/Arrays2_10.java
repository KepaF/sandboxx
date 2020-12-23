package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_10 {
    static double[] getGeometricProgression(double beginElement, double step, int dim) {
        double[] array = new double[dim];
        array[0] = beginElement;
        for(int i = 1; i < dim; i++) {
            array[i] = array[i-1]*step;
        }
        return array;
    }
}
