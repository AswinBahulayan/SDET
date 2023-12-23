package LinkedList;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ReverseLinkedList {

    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data=data;
        }
    }

    public Node addNode(int data) {
        return new Node(data);
    }

    @Test
    public void reverseNode() {
        Node head=addNode(10);

        Node second=addNode(11);
        head.next=second;

        Node third=addNode(11);
        second.next=third;

        Node fourth=addNode(13);
        third.next=fourth;

        DuplicateLinkedList(head);

    }

    public void printAll(Node node) {

        while(node.next!=null) {
            System.out.println(node.data);
            node =node.next;
        }
    }

   /* public List<Node> reverseLinkedList(Node node) {
       *//* Node head=node;
        List<Node> list=new ArrayList<>();
        while(head!=null) {
            list.add(head);
            head=head.next;
        }
//        Node temp=new Node();
        Node out=temp;
        for (int i = list.size()-1; i >=0; i--) {
            temp=list.get(i);
            temp=temp.next;
        }
        return list;*//*
    }*/

    /*
    * if data at node and node.next is equal then print the value*/
    public void DuplicateLinkedList(Node node) {
        while(node.next!=null) {
            if(node.data==node.next.data) {
               node.next=node.next.next;
            }else {
                node = node.next;
            }
        }
    }

}
