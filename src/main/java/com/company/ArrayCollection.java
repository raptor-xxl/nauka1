package com.company;

public class ArrayCollection implements Collection, Mergable {

    private Object[] data;
    private int size = 0;

    public ArrayCollection() {
        data = new Object[256];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean delete(Object o) {
        return false;
    }

    public boolean isPresent(Object o) {
        if (o == null) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

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
