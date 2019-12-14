package com.company.list;

class Node<T> {
    private final T data;
    public T getData;
    private Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    T getData() {
        return data;
    }

    Node<T> getNext() {
        return next;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }
}
