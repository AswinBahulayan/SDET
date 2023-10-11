package LinkedListImplementation;

import org.junit.Test;

public class ListNode {
    ListNode next;
    int val;

    public ListNode(){

    }

    public ListNode(int value) {
        this.val = value;
        next = null;
    }

    //14 ,null
    //20, node4
    public ListNode(int value, ListNode next) {
        this.val = value;
        this.next = next;
    }

    @Test
   public void test(){
        ListNode one=new ListNode(9);
        ListNode two=new ListNode(10,one);
        ListNode three=new ListNode(11,two);
   }
}