package com.testtask.servicestest;

public class SimpleSingleton {

    private SimpleSingleton() { }

    private static SimpleSingleton instance = new SimpleSingleton();

    public static SimpleSingleton getInstance() { return instance; }

    private AnotherSimpleSingleton anotherSimpleSingleton = AnotherSimpleSingleton.getInstance();

    public Integer doSomething() {
        return anotherSimpleSingleton.calc();
    }
}
