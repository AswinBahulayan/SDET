package LinkedListImplementation;

import org.junit.Test;

public class MergeLinkedList {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }

        public Node(){}
    }

    public Node addNode(int data){
        return new Node(data);
    }

    public void printNode(Node node){
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    public Node mergeLinkedList(Node node1,Node node2){
        Node merge=new Node(0);
        Node out=merge;
        while (node1!=null && node2!=null){
            if(node1.data< node2.data){
                out.next=node1;
                node1=node1.next;
            } else if (node2.data< node1.data) {
                out.next=node2;
                node2=node2.next;
            }else{
                out.next=node1;
                node1=node1.next;
                node2=node2.next;
            }
            out=out.next;
        }
        if(node1!=null)out.next=node1;
        if(node2!=null)out.next=node2;
        return merge.next;
    }

    @Test
    public void test(){
        Node odd=addNode(1);

        Node second=addNode(3);
        odd.next=second;

        Node third=addNode(5);
        second.next=third;

        Node fourth=addNode(7);
        third.next=fourth;

        Node even=addNode(1);

        Node fifth=addNode(2);
        even.next=fifth;

        Node sixth=addNode(4);
        fifth.next=sixth;

        Node seventh=addNode(6);
        sixth.next=seventh;

        Node out=mergeLinkedList(odd,even);
        printNode(out);
    }
}
