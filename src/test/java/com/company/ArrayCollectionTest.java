package com.company;

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

    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveSize0WhenAddedNull() {
        ArrayCollection a = new ArrayCollection();
        a.add(null);
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
    public void shouldDeleteOnlyWhenPresent() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("A"));
        assertTrue(a.add("B"));
        assertTrue(a.delete("A"));
        assertFalse(a.delete("A"));
        assertEquals(1, a.getSize());
    }

    @Test
    public void shouldHaveCorrectDataWhenManyOperations() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("A"));
        assertFalse(a.delete("B"));
        assertTrue(a.add("B"));
        assertTrue(a.add("B"));
        assertTrue(a.delete("A"));
        assertFalse(a.delete("A"));
        assertEquals(2, a.getSize());
        assertTrue(a.add("C"));
        assertTrue(a.delete("B"));
        assertTrue(a.isPresent("B"));
        assertEquals(2, a.getSize());
    }

    @Test
    public void shouldReturnFalseWhenNull() {
        ArrayCollection a = new ArrayCollection();
        assertFalse(a.deleteAll(null));
    }

    @Test
    public void shouldReturnFalseWhenElementNotPresent() {
        ArrayCollection a = new ArrayCollection();
        assertFalse(a.deleteAll("A"));
    }

    @Test
    public void shouldReturnTrueWhenElementPresent() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("A"));
        assertTrue(a.deleteAll("A"));
    }

    @Test
    public void shouldDeleteAllWhenMultipleInstancePresent() {
        ArrayCollection a = new ArrayCollection();
        assertTrue(a.add("Adam"));
        assertTrue(a.add("Adam"));
        assertTrue(a.add("Adam"));
        assertTrue(a.add("Adam"));
        assertTrue(a.add("Tomek"));
        assertTrue(a.add("Tomek"));
        assertTrue(a.add("Tomek"));
        assertTrue(a.add("Adam"));
        assertTrue(a.deleteAll("Adam"));
        assertEquals(3, a.getSize());
        assertTrue(a.add("Adam"));
        assertEquals(4, a.getSize());
    }

    @Test
    public void shouldBeSameWhenMergingWithEmpty() {
        ArrayCollection a = new ArrayCollection();
        ArrayCollection b = new ArrayCollection();
        assertTrue(a.add("A"));
        Mergable c = a.merge(b);
        assertEquals(1, c.getSize());
        assertEquals(a.get(0), c.get(0));
    }

    @Test
    public void shouldMergeWhenNotEmpty() {
        ArrayCollection a = new ArrayCollection();
        ArrayCollection b = new ArrayCollection();
        assertTrue(a.add("A"));
        assertTrue(a.add("B"));
        assertTrue(b.add("C"));
        Mergable c = a.merge(b);
        assertEquals(3, c.getSize());
        assertEquals(a.get(0), c.get(0));
        assertEquals(a.get(1), c.get(1));
        assertEquals(b.get(0), c.get(2));
    }
}
