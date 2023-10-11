package classRoom;

import org.junit.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedList {
    int data;
    LinkedList head;
    LinkedList tail;
    LinkedList next;

    public LinkedList(){

    }
    public LinkedList(int key) {
        this.data = key;
        next = null;
    }

    public void add(int key) {
        LinkedList linked=new LinkedList(key);
        if (head == null) {
            //head = tail = linked;
            tail=linked;
            head=tail;
        } else {
            tail.next= linked;
            tail=tail.next;
        }
    }

    public void addAll(List<Integer> list){
        for (Integer each:
             list) {
            add(each);
        }
    }

    public int lastIndexOf(int key){
        LinkedList temp=head;
        int index=0;
        int last=0;
        while(temp.next!=null){
           if(temp.data==key){
               last=index;
           }
            index++;
           temp=temp.next;
        }
        return  last;
    }

    public LinkedList clone(){
        LinkedList list=new LinkedList();
        list=head;
        return list;
    }

    public void display(){
        LinkedList temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(10);//0
        list.add(11);//1
        list.add(12);//2
        list.add(13);//3
        list.add(12);//4
        list.add(13);//5
        list.addAll(Arrays.asList(1,2,3,4));
        LinkedList clone = list.clone();
        list.display();
        list.display();
        System.out.println(list.lastIndexOf(12));
        /*while(list.head.next!=null){
            System.out.println(list.head.data);
            list.head=list.head.next;
        }*/
    }
}
