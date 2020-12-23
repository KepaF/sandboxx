package ru.ssau.tk._KEPAF_._sandboxx_.String;

public class String3_3 {
    public static void main(String[] args) {
        String str = "hello world";
        String str1 = new String(str);
        String str2 = "hello world";
        if(str==str2){
            System.out.println("str==str2");
        }
        if (str == str1) {
            System.out.println("str==str1");
        }
        if (str.equals(str1)) {
            System.out.println("str.equals(str1)");
        }
    }
}


