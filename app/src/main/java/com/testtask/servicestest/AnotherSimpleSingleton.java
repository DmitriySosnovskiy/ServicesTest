package com.testtask.servicestest;

public class AnotherSimpleSingleton {

    private static AnotherSimpleSingleton instance = new AnotherSimpleSingleton();

    private AnotherSimpleSingleton() { }

    private Integer one = 1;
    private Integer two = 2;
    private Integer three = 3;

    public static AnotherSimpleSingleton getInstance() { return  instance; }

    public Integer calc() { return  one + two + three; }

}
