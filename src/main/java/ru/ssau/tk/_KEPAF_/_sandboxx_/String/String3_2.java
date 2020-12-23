package ru.ssau.tk._KEPAF_._sandboxx_.String;

public class String3_2 {
    public void getStr(String str){
        byte[] bytes = str.getBytes();
        for (byte byt:bytes) {
            System.out.println(byt);
        }
    }
}
