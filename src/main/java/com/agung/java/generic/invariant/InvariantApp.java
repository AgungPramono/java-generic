package com.agung.java.generic.invariant;

import com.agung.java.generic.Generic;

public class InvariantApp {

    public static void main(String[] args) {
        Generic.Data<String> stringMyData = new Generic.Data<>();
        stringMyData.setData("Agung Pramono");
//        doIt(stringMyData);//error invariant
//        Generic.Data<Object> objectData = stringMyData;//ERROR
    }

    public static void doIt(Generic.Data<Object> objectData){
        //do nothing
    }

}
