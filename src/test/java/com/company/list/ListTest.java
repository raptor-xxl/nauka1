package com.company.list;

import com.company.Mergable;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {
    @Test
    public void shouldReturnFalsePresentWhenNull() {
        List a = new List();
        assertFalse(a.isPresent(null));
    }

    @Test
    public void shouldReturnFalseWhenNotPresent() {
        List a = new List();
        assertFalse(a.isPresent("A"));
    }

    @Test
    public void shouldReturnTrueWhenPresent() {
        List a = new List();
        assertTrue(a.add("A"));
        assertTrue(a.isPresent("A"));
    }

    @Test
    public void shouldHaveSize1WhenAdded1Element() {
        List a = new List();
        assertTrue(a.add("Str"));
        assertEquals(1, a.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveSize0WhenAddedNull() {
        List a = new List();
        a.add(null);
    }

    @Test
    public void shouldBeEmptyWhenDeleted() {
        List a = new List();
        assertTrue(a.add("A"));
        assertTrue(a.delete("A"));
        assertEquals(0, a.getSize());
    }

    @Test
    public void shouldNotDeleteWhenNull() {
        List a = new List();
        assertTrue(a.add("A"));
        assertFalse(a.delete(null));
        assertEquals(1, a.getSize());
    }

    @Test
    public void shouldNotDeleteWhenDeletedElementNotPresent() {
        List a = new List();
        assertTrue(a.add("A"));
        assertFalse(a.delete("B"));
        assertEquals(1, a.getSize());
    }

    @Test
    public void shouldDeleteOnly1InstanceWhenMultiplePresent() {
        List<String> a = new List<>();
        assertTrue(a.add("A"));
        assertTrue(a.add("A"));
        assertTrue(a.add("A"));
        assertTrue(a.delete("A"));
        assertEquals(2, a.getSize());
    }

    @Test
    public void shouldDeleteOnlyWhenPresent() {
        List a = new List();
        assertTrue(a.add("A"));
        assertTrue(a.add("B"));
        assertTrue(a.delete("A"));
        assertFalse(a.delete("A"));
        assertEquals(1, a.getSize());
    }

    @Test
    public void shouldHaveCorrectDataWhenManyOperations() {
        List a = new List();
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
        List a = new List();
        assertFalse(a.deleteAll(null));
    }

    @Test
    public void shouldReturnFalseWhenElementNotPresent() {
        List a = new List();
        assertFalse(a.deleteAll("A"));
    }

    @Test
    public void shouldReturnTrueWhenElementPresent() {
        List a = new List();
        assertTrue(a.add("A"));
        assertTrue(a.deleteAll("A"));
    }

    @Test
    public void shouldDeleteAllWhenMultipleInstancePresent() {
        List a = new List();
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
        List a = new List();
        List b = new List();
        assertTrue(a.add("A"));
        Mergable c = a.merge(b);
        assertEquals(1, c.getSize());
        assertEquals(a.get(0), c.get(0));
    }

    @Test
    public void shouldMergeWhenNotEmpty() {
        List a = new List();
        List b = new List();
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
