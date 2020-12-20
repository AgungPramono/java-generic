package com.agung.java.generic.comparable;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("priyo", "Indonesia"),
                new Person("agung", "Indonesia"),
                new Person("dedi", "Indonesia")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
