package com.company.list;

class Node {
    private Object data;
    private Node next;

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    Object getData() {
        return data;
    }

    Node getNext() {
        return next;
    }
}
