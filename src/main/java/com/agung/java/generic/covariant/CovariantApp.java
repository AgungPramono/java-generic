package com.agung.java.generic.covariant;

import com.agung.java.generic.Generic;

public class CovariantApp {

    public static void main(String[] args) {
        Generic.Data<String> stringData = new Generic.Data<>();
        stringData.setData("Agung");
        process(stringData);

        Generic.Data<? extends Object>data = stringData;
        process(data);
    }

    public static void process(Generic.Data<? extends Object> data){
        System.out.println(data.getData());

//        data.setData(1);//tidak boleh karena berbahaya
    }
}
