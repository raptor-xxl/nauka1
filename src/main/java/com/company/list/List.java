package com.company.list;

import com.company.Collection;
import com.company.Mergable;

public class List<T> implements Collection<T>, Mergable<T> {

    private Node start = null;
    private int size = 0;

    @Override
    public boolean isPresent(T o) {
        return false;
    }

    @Override
    public boolean add(T o) {
        return false;
    }

    @Override
    public boolean delete(T o) {
        return false;
    }

    @Override
    public boolean deleteAll(T o) {
        return false;
    }

    @Override
    public Mergable merge(Mergable m) {
        return null;
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
