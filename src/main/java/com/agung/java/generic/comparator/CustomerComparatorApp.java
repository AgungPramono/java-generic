package com.agung.java.generic.comparator;

import com.agung.java.generic.comparable.Person;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerComparatorApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("priyo", "Indonesia"),
                new Person("agung", "Indonesia"),
                new Person("dedi", "Indonesia")
        };

        Comparator<Customer> comparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
