package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_34 {
    static Double multiply(Double[] array) {
        double number = 5.;
        for (Double i : array) {
            if(i.isNaN()||i.isInfinite()){
                continue;
            }
            number*=i;
        }
        return number;
    }
}
