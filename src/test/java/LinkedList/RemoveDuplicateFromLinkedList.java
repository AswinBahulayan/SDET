package LinkedList;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromLinkedList {

    @Test
    public void test(){
        List<Integer> list3 = Arrays.asList(1,1,2);
        ListNode list=new ListNode();
        ListNode add = list.add(list3);
        ListNode listNode = deleteDuplicates(add);
    }

    @Test
    public void test1(){
        List<Integer> list3 = Arrays.asList(1,1,2,3,3);
        ListNode list=new ListNode();
        ListNode add = list.add(list3);
        ListNode listNode = deleteDuplicates(add);
    }

    /**
     1.input is a listNode
     2.output is a listNode
     3.declare variable ListNode prev and set to head;
     4.iterate prev until prev.next not equal to null
     5.if prev.val and prev.next.val are same then set prev.next to prev.next.next
     6.else set prev to prev.next
     7.finally return head*/
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode prev=new ListNode();
        prev=head;
        while(prev.next!=null){
            if(prev.val==prev.next.val){
                prev.next=prev.next.next;
            }else{
                prev=prev.next;
            }
        }
        return head;
    }

}
