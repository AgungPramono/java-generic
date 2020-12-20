package com.agung.java.generic.wilcard;

import com.agung.java.generic.Generic;
import com.agung.java.generic.bounded.multi.MultipleConstrainApp;

public class WilcardApp {
    public static void main(String[] args) {
        Generic.Data<Integer> integerData = new Generic.Data<>();
        Generic.Data<String>stringData = new Generic.Data<>();

        integerData.setData(133);
        stringData.setData("Agung");

        print(integerData);
        print(stringData);
    }

    public static void print(Generic.Data<?> myData){
//        String data = myData.getData(); //dilarang convert tipe data wilcard
        System.out.println(myData.getData());
    }
}
