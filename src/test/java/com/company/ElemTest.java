package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElemTest {
    @Test
    public void shouldReturnFalseWhenComparedWithNull() {
        Elem a = new Elem("a", 5);
        assertNotEquals(null, a);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithOtherObject() {
        Elem a = new Elem("a", 5);
        assertNotEquals("A", a);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithDifferentElem1() {
        Elem a = new Elem(null, 5);
        Elem b = new Elem("b", 5);
        assertNotEquals(b, a);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithDifferentElem2() {
        Elem a = new Elem("a", 5);
        Elem b = new Elem("a", 7);
        assertNotEquals(b, a);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithDifferentElem3() {
        Elem a = new Elem("a", 5);
        Elem b = new Elem("b", 7);
        assertNotEquals(b, a);
    }

    @Test
    public void shouldReturnTrueWhenComparedWithSameElem() {
        Elem a = new Elem("a", 5);
        Elem b = new Elem("a", 5);
        assertEquals(b, a);
    }
}
