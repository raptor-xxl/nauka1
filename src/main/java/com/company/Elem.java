package com.company;

public class Elem {
    private String s;
    private int i;

    public Elem(String s, int i) {
        this.s = s;
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
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
        return i == a.i && (s == null && a.s == null || (s != null && s.equals(a.s)));
    }
}
