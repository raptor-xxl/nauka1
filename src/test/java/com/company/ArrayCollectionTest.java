package com.company;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayCollectionTest {

    @Test
    public void shouldReturnFalsePresentWhenNull() {
        ArrayCollection a = new ArrayCollection();
        assertFalse(a.isPresent(null));
    }

    @Test
    public void shouldReturnFalseWhenNotPresent() {
        ArrayCollection a = new ArrayCollection();
        assertFalse(a.isPresent("A"));
    }

    @Test
    public void shouldReturnTrueWhenPresent() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("A"));
        assertTrue(a.isPresent("A"));
    }

    @Test
    public void shouldHaveSize1WhenAdded1Element() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("Str"));
        assertEquals(1, a.getSize());
    }

    @Test
    public void shouldHaveSize0WhenAddedNull() {
        ArrayCollection a = new ArrayCollection();
        assertFalse(a.add(null));
        assertEquals(0, a.getSize());
    }

    @Test
    public void shouldNotAddNewElementWhenArrayIsFull() {
        ArrayCollection a = new ArrayCollection();
        for (int i = 0; i < 256; i++) {
            assertTrue(a.add("A"));
        }
        assertFalse(a.add("A"));
        assertEquals(256, a.getSize());
    }

    @Test
    public void shouldBeEmptyWhenDeleted() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("A"));
        assertTrue(a.delete("A"));
        assertEquals(0, a.getSize());
    }

    @Test
    public void shouldNotDeleteWhenNull() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("A"));
        assertFalse(a.delete(null));
        assertEquals(1, a.getSize());
    }

    @Test
    public void shouldNotDeleteWhenDeletedElementNotPresent() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("A"));
        assertFalse(a.delete("B"));
        assertEquals(1, a.getSize());
    }

    @Test
    public void shouldDeleteOnly1InstanceWhenMultiplePresent() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("A"));
        assertTrue(a.add("A"));
        assertTrue(a.add("A"));
        assertTrue(a.delete("A"));
        assertEquals(2, a.getSize());
    }

    @Test
    public void shouldHaveCorrectDataWhenManyOperations() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("A"));
        assertFalse(a.delete("B"));
        assertTrue(a.add("B"));
        assertTrue(a.add("B"));
        assertTrue(a.delete("A"));
        assertEquals(2, a.getSize());
        assertTrue(a.add("C"));
        assertTrue(a.delete("B"));
        assertEquals(2, a.getSize());
    }

}
