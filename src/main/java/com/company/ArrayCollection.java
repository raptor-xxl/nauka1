package com.company;

public class ArrayCollection implements Collection, Mergable {

    private Object[] data;
    private int size = 0;

    public ArrayCollection() {
        data = new Object[256];
    }

    @Override
    public boolean add(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        if (size == data.length) {
            return false;
        }
        data[size++] = o;
        return true;
    }

    private int index(Object o) {
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
    public boolean delete(Object o) {
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
    public boolean deleteAll(Object o) {
        boolean deletedAny = false;
        while (delete(o)) {
            deletedAny = true;
        }
        return deletedAny;
    }

    @Override
    public boolean isPresent(Object o) {
        return index(o) != -1;
    }

    @Override
    public Mergable merge(Mergable m) {
        if (m == null) {
            return this;
        }

        ArrayCollection result = new ArrayCollection();
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
    public Object get(int i) {
        return data[i];
    }
}
