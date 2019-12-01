package com.company.list;

import com.company.Collection;
import com.company.Mergable;

public class List<T> implements Collection<T>, Mergable<T> {

    private Node<T> start = null;
    private int size = 0;

    @Override
    public boolean isPresent(T o) {
        if (o == null) {

            return false;
        }
        for (int i = 1; i < size; i++) {

            if (equals(start)) {

            }
            return true;
        }
        return true;
    }


    @Override
    public boolean add(T o) {
        start = new Node<T>(o);
        size ++;
        return true;

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
    public Mergable<T> merge(Mergable<T> m) {
        return null;
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }
}
