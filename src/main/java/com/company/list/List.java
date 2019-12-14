package com.company.list;

import com.company.Collection;
import com.company.Mergable;
import org.w3c.dom.CDATASection;

public class List<T> implements Collection<T>, Mergable<T> {

    private Node<T> start = null;
    private int size = 0;

    @Override
    public boolean isPresent(T o) {
        if (o == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {

            if (o.equals(start.getData)){
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean add(T o) {
        if (o == null) {
            throw new IllegalArgumentException("Is null");
        }
        Node<T> n = start;
        start = new Node<T>(o);
        start.setNext(n);
        size++;
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
