package com.org.clone;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyHome myHome = new MyHome(100, "Sweet home", "Braunschweig", "stag");
        System.out.println(myHome.hashCode());
        System.out.println(myHome.clone().hashCode());
    }
}

class MyHome {

    private int id;
    private String name;
    private String city;
    private String address;

    MyHome(int id, String name, String city, String address) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new MyHome(id, name, city, address);
    }
}
