package com.company.list;

class Node {
    private final Object data;
    private Node next;

    Node(Object data) {
        this.data = data;
    }

    Object getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
