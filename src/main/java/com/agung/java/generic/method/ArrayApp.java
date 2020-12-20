package com.agung.java.generic.method;

public class ArrayApp {

    public static void main(String[] args) {
        ArrayHelper arrayHelper = new ArrayHelper();

        Integer[]data={12,12,33,53,563};
        String[]arryString={"satu","dua","tiga"};

        int length = arrayHelper.count(data);
        int arrayStringLength = arrayHelper.count(arryString);

        System.out.println(length);
        System.out.println(arrayStringLength);
    }

}
