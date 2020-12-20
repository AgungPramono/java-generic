package com.agung.java.generic.bounded;

import java.util.List;

public class BoundedTypeParameterApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(10);
        NumberData<Long> longNumberData = new NumberData<>(10L);

//        NumberData<String> stringNumberData = new NumberData<>("123");//tidak bisa, string bukan turunan dari Number

    }

    //hanya parameter turunan dari Number yg bisa digunakan
    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
