package com.org.java8.methodreferance;

public class FunctionalInterfaceExample implements Sayable {
    @Override
    public void say(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface Sayable {
    void say(String message);
}
