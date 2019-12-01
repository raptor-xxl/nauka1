package com.company;

public interface Mergable<E> extends Gettable<E> {
    Mergable<E> merge(Mergable<E> m);
}
