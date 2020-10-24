package com.java.LinkedList;

public class LinkedList {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;

    public int size() {
        if (head == null) {
            return 0;
        }
        int i = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            i++;
        }
        return i;
    }

    public void addFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        // set its next to the existing head
        newNode.next = head;
        // set current head to the new node
        head = newNode;
    }

    public int getFirst() {
        return head.data;
    }

    public int getLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public void addback(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cuurrentNode = head;
        while (cuurrentNode.next != null) {
            cuurrentNode = cuurrentNode.next;
        }
        cuurrentNode.next = newNode;
    }

    public void clear(){
        head=null;
    }

    public void deletvalue(int data) {
            if (head == null) {
                return;
            }
            if(head.data==data){
                head= head.next;
                return;
            }
            Node cuurrentNode = head;
            while (cuurrentNode.next != null) {
                if(cuurrentNode.next.data == data)
                {
                    cuurrentNode.next = cuurrentNode.next.next;
                    return;
                }
            }

    }
}
