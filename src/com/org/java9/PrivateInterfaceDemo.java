package com.org.java9;

interface PrivateDemo {
    private void print() {
        System.out.println(" private method ");
    }

    default void privateDemo() {
        System.out.println("default method ");
        print();
    }

    void normalMethod();
}
public class PrivateInterfaceDemo {
}
