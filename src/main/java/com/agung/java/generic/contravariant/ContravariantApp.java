package com.agung.java.generic.contravariant;

import com.agung.java.generic.Generic;

public class ContravariantApp {

    public static void main(String[] args) {

        Generic.Data<Object> objectData = new Generic.Data<>();
        objectData.setData("Agung");
//        objectData.setData(1000);

        Generic.Data<? super String> myData = objectData;

        process(objectData);

        System.out.println(objectData.getData());

    }

    public static void process(Generic.Data<? super String> myData){
        String value = (String) myData.getData();//tidak aman, karena parameter type object bisa diset apapun
        System.out.println("Process Parameter "+value);

        myData.setData("agung");
    }

}
