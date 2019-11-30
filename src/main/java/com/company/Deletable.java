package com.company;

public interface Deletable<E> {
    boolean delete(E o);

    boolean deleteAll(E o);
}
