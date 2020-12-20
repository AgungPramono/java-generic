package com.agung.java.generic.bounded.multi;

public class MultipleConstrainApp {
    public static void main(String[] args) {
        //Data<Manager> managerData = new Data<>(new Manager());//ERROR, manager belum implement canEditDocument
        Data<CEO> ceoData = new Data<>(new CEO());


    }

    public static interface CanEditDocument{
        void canEdit(String message);
    }

    public static class Employee{

    }

    public static class Manager extends Employee{

    }

    public static class CEO extends Employee implements CanEditDocument{

        @Override
        public void canEdit(String message) {
            System.out.println("Document edit by CEO");
        }
    }

    public static class Data<T extends Employee & CanEditDocument>{
        private T data;

        public Data(T data) {
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
