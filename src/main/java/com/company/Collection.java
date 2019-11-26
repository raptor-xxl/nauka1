package com.company;

public interface Collection extends Addable, Deletable {
    boolean isPresent(Object o);

    default boolean isCollection(boolean b) {
        return true;
    }
}
