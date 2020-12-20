package com.agung.java.generic.multi;

public class PairApp {
    public static void main(String[] args) {

        Pair<String,Integer> pairString = new Pair<>("Indonesia",100);
        System.out.println(pairString.getData());
        System.out.println(pairString.getLocation());



    }
}
