package com.company;

public class ArrayCollection implements Collection, Mergable {

    private Object[] data;
    private int size = 0;

    public ArrayCollection() {
        data = new Object[256];
    }

    @Override
    public boolean add(Object o) {
        if (o == null || size == data.length) {
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
        if (index(o) == 1) {

        }
        return false;
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
        ArrayCollection ma;
        if (m instanceof ArrayCollection) {
            ma = (ArrayCollection) m;
        } else {
            return this;
        }
        ArrayCollection result = new ArrayCollection();
        result.size = this.size + ma.size;
        System.arraycopy(this.data, 0, result.data, 0, this.size);
        System.arraycopy(ma.data, 0, result.data, this.size, ma.size);
        return result;
    }

    public int getSize() {
        return size;
    }
}
