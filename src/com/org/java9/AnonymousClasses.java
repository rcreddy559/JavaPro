package com.org.java9;

import com.org.utils.Employee;

public class AnonymousClasses {
    public static void main(String[] args) {
        Anonymous<Employee> anonymous = new Anonymous() {
            @Override
            void print() {

            }
        };
        }
}


abstract class Anonymous<T> {
    abstract void print();
}
