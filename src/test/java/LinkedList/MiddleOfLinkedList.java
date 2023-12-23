package LinkedList;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MiddleOfLinkedList {
    /*https://leetcode.com/problems/middle-of-the-linked-list/*/
    /**
     1.input is a ListNode
     2.Output is listNode
     3.find the size of the input node using a temp Listnode
     4.to find size make size as size/2
     5.now iterate head until count variable not eqaul to size
     6.return listnode */
    @Test
    public void test(){
        ListNode list=new ListNode();
        ListNode head = list.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        middleNode1(head);
    }

    @Test
    public void test1(){
        ListNode list=new ListNode();
        ListNode head = list.add(Arrays.asList(1, 2, 3));
        middleNode1(head);
        Deque<String> queue=new ArrayDeque<>();

    }
    public ListNode middleNode(ListNode head) {
        ListNode temp=new ListNode();
        temp=head;
        int size=0,count=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        size/=2;
        size+=1;
        while(count!=size){
            count++;
            head=head.next;
        }
        return head;
    }

    public ListNode middleNode1(ListNode head) {
        if(head.next==null)return head;
        ListNode temp=head;
        ListNode slow=temp;
        ListNode fast=temp;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }
}
