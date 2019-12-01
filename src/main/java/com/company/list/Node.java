package com.company.list;

class Node<T> {
    private final T data;
    private Node<T> next;

    Node(T data) {
        this.data = data;
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
