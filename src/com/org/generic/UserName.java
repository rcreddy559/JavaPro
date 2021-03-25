package com.org.generic;

import java.util.Objects;

public class UserName implements Comparable<UserName> {
    private String name;

    public UserName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(UserName o) {
        if(o.getName().equals(this.getName()))
            return 0;
        else
            return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserName)) return false;

        UserName userName = (UserName) o;

        return getName() != null ? getName().equals(userName.getName()) : userName.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }
}
