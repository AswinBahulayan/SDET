package Homework;

import org.junit.Test;

class MyCircularDeque {

    public class Node {
        int val;
        Node next;
        Node previous;

        public Node() {
        }

        public Node(int value) {
            this.val = value;
        }
    }

    Node head;
    Node tail;
    int maxSize, currSize;

    public MyCircularDeque(int k) {
        head = new Node();
        tail = new Node();
        this.maxSize = k;
        this.currSize = 0;
    }

    public boolean insertFront(int value) {
        if (currSize < maxSize) {
            currSize++;
            Node node = new Node(value);
            node.next = head;
            node.previous = tail;
            tail.next = node;
            head = node;
            return true;
        } else {
            return false;
        }
    }

    public boolean insertLast(int value) {
        if(currSize<maxSize){
            Node node=new Node(value);
            node.previous=tail;
            node.next=head;
            tail.next=node;
            tail=node;
            currSize++;
            return true;
        }else{
            return false;
        }
    }

    public boolean deleteFront() {
        if (currSize > 0) {
            head = head.next;
            currSize--;
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (currSize > 0) {
            tail = tail.next;
            currSize--;
            return true;
        } else {
            return false;
        }
    }

    public int getFront() {
        return head.val;
    }

    public int getRear() {
        return tail.val;
    }

    public boolean isEmpty() {
        return currSize == 0;
    }

    public boolean isFull() {
        return currSize == maxSize;
    }

    public static void main(String[] args) {
        MyCircularDeque que=new MyCircularDeque(5);
        que.insertFront(1);
        que.insertFront(2);
        que.insertFront(3);
        que.deleteLast();
    }

}
