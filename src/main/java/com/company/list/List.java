package com.company.list;

import com.company.Collection;
import com.company.Mergable;

public class List implements Collection, Mergable {

    private Node start = null;
    private Node end = null;
    private int size = 0;

    @Override
    public boolean isPresent(Object o) {
        return false;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public boolean deleteAll(Object o) {
        return false;
    }

    @Override
    public Mergable merge(Mergable m) {
        return null;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
