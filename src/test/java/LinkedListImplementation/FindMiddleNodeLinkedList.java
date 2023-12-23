package LinkedListImplementation;

import org.junit.Test;

public class FindMiddleNodeLinkedList {

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public Node addNode(int data){
        return new Node(data);
    }

    @Test
    public void Test(){
        Node head=addNode(1);

        Node second=new Node(2);
        head.next=second;

        Node third=addNode(3);
        second.next=third;

        Node fourth=addNode(4);
        third.next=fourth;

        Node fifth=addNode(5);
        fourth.next=fifth;

        Node node=middleNode(head);
        printNode(node);

    }

    @Test
    public void Test2(){
        Node head=addNode(1);

        Node second=new Node(2);
        head.next=second;

        Node third=addNode(3);
        second.next=third;

        Node fourth=addNode(4);
        third.next=fourth;


        Node node=middleNode(head);
        printNode(node);

    }

    public void printNode(Node node){
        Node head=node;
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }


    private Node middleNode(Node head) {
        Node slow=head,fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
