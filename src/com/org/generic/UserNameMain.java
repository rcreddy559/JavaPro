package com.org.generic;


import java.util.HashSet;
import java.util.Set;

public class UserNameMain {
    public void fun1() {
        Set<UserName> un = new HashSet<>();
//        un.add(new UserName("fun1 name"));
        un.add(new UserName("fun1 name"));
        un.forEach(e->System.out.println(e.getName()));
        System.out.println("----------------------------");
        Set<UserName> un2 = fun2(un);

        un.forEach(e->System.out.println(e.getName()));
    }

    private Set<UserName> fun2(Set<UserName> un) {
//        UserName u =new UserName("fun2 name");
        UserName u = un.iterator().next();
        u.setName("fun1 name");
//        un.add(u);
        return un;
    }

    public static void main(String[] args) {
        new UserNameMain().fun1();
    }
}
