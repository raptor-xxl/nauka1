package com.company;

public interface Collection<E> extends Addable<E>, Deletable<E> {
    boolean isPresent(E o);

    default boolean isCollection(boolean b) {
        return true;
    }
}
