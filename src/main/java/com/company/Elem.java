package com.company;

import java.util.Objects;

public class Elem {
    private String str;
    private int i;

    public Elem(String str, int i) {
        System.out.println("Konstruktor elema: " + str);
        this.str = str;
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Elem)) {
            return false;
        }
        Elem a = (Elem) obj;
        return i == a.i && (str == null && a.str == null || (str != null && str.equals(a.str)));
    }

    @Override
    public int hashCode() {
        int h1 = str.hashCode();
        return Objects.hash(str, i);
    }
}
