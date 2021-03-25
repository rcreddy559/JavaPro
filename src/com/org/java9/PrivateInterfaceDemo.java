package com.org.java9;

interface PrivateDemo {
    private void print() {
        System.out.println("private method ");
    }

    default void privateDemo() {
        System.out.println("default method ");
        print();
    }

    default void privateDemo2() {
        System.out.println("default method ");
        print();
    }

    static private void print2() {
        System.out.println("static private method ");
    }

    static void publicStatic() {
        System.out.println("static default method ");
        print2();
    }

    void normalMethod();
}
public class PrivateInterfaceDemo extends A implements PrivateDemo  {

    static public void testStatic() {
        System.out.println(" A::testStatic");
    }

    @Override
    public void normalMethod() { System.out.println("Normal Method"); }

    public static void main(String[] args) {
        PrivateInterfaceDemo p = new PrivateInterfaceDemo();
        p.normalMethod();
        p.privateDemo();

        PrivateDemo.publicStatic();
        PrivateInterfaceDemo.testStatic();
    }
}


class A {
    static public void testStatic() {
        System.out.println(" A::testStatic");
    }
}



