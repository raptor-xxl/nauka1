package com.company;

public class ArrayCollection<E> implements Collection<E>, Mergable<E> {

    private E[] data;
    private int size = 0;

    public ArrayCollection() {

        data = (E[]) new Object[256];
    }

    @Override
    public boolean add(E o) {
        if (o == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        if (size == data.length) {
            return false;
        }
        data[size++] = o;
        return true;
    }

    private int index(E o) {
        if (o == null) {
            return -1;
        }

        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean delete(E o) {
        int c = index(o);
        if (c == -1) {
            return false;
        }
        for (int i = c; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        return true;
    }

    @Override
    public boolean deleteAll(E o) {
        boolean deletedAny = false;
        while (delete(o)) {
            deletedAny = true;
        }
        return deletedAny;
    }

    @Override
    public boolean isPresent(E o) {
        return index(o) != -1;
    }

    public <T> T fun(T a) {
        return a;
    }

    @Override
    public Mergable<E> merge(Mergable<E> m) {
        if (m == null) {
            return this;
        }

        ArrayCollection<E> result = new ArrayCollection<>();
        result.size = this.size;
        System.arraycopy(this.data, 0, result.data, 0, this.size);
        for (int i = 0; i < m.getSize(); ++i) {
            result.add(m.get(i));
        }

        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public E get(int i) {
        return data[i];
    }
}
