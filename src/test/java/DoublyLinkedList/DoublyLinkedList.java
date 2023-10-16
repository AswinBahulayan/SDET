package DoublyLinkedList;

import java.util.List;

public class DoublyLinkedList {

    int value;
    DoublyLinkedList head;
    DoublyLinkedList prev;
    DoublyLinkedList next;
    DoublyLinkedList tail;

    public DoublyLinkedList(){

    }

    public DoublyLinkedList(int value){
        this.value=value;
        this.next=null;
        this.prev=null;
    }

    public void add(int value){
        if(head==null){
            tail=new DoublyLinkedList(value);
            head=tail;
        }else{
            DoublyLinkedList nodeD=new DoublyLinkedList(value);
            nodeD.prev=tail;
            tail.next=nodeD;
            tail=tail.next;
        }
    }

    public void removeFirst(){
        head=head.next;
        head.prev=null;
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        DoublyLinkedList temp=list.head;
        while (temp!=null){
            System.out.println("next: "+temp.value);
            temp=temp.next;
        }
        while(list.prev!=null){
            System.out.println("previous: "+list.value);
            list=list.prev;
        }

    }


}
