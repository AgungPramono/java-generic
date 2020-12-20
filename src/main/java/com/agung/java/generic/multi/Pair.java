package com.agung.java.generic.multi;

public class Pair <T,U>{
    private T data;
    private U location;


    public Pair(T data, U location) {
        this.data = data;
        this.location = location;
    }

    public T getData() {
        return data;
    }

    public U getLocation() {
        return location;
    }
}
