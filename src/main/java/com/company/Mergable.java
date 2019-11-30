package com.company;

public interface Mergable<E> extends Gettable<E> {
    Mergable merge(Mergable m);
}
