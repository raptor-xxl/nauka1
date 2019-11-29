package com.company;

public interface Mergable extends Gettable {
    Mergable merge(Mergable m);
}
