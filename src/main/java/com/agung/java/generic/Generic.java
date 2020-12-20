package com.agung.java.generic;

/**
 * Hello world!
 *
 */
public class Generic
{
    public static void main(String[] args) {
        Data<String> dataString = new Data<String>();
        dataString.setData("Nama Saya");
        String value = dataString.getData();
        System.out.println("data string"+value);

        Data<Integer> dataInteger =  new Data<>();
        dataInteger.setData(200);
        Integer result = dataInteger.getData();
        System.out.println("data integer"+result);
    }

    //generic parameter type
    public static class Data<T>{
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
