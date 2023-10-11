package LinkedListImplementation;

import org.junit.Assert;
import org.junit.Test;

/*
* https://leetcode.com/problems/reverse-linked-list/description/*/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return  null;
        if(head.next == null) return head;

        ListNode currentHead = null;

        while(head != null){
            currentHead = new ListNode(head.val, currentHead);
            head = head.next;
        }

        return currentHead;
    }

    public ListNode reverseList1(ListNode head) {
        if(head == null) return  null;
        if(head.next == null) return head;

        ListNode currentHead = null, previousNode = null;

        while(head != null){
            currentHead = new ListNode(head.val);
            currentHead.next = previousNode;
            previousNode= currentHead;
            head = head.next;
        }

        return currentHead;
    }

    @Test
    public void test(){
        ListNode head = reverseList(new SinglyLinkedList().add(new int[]{1,2,3,4}));
        String a = new SinglyLinkedList().print(head);
        System.out.println(a);
        Assert.assertEquals("[4,3,2,1,]", a);
    }
    @Test
    public void test1(){
        ListNode head = reverseList(new SinglyLinkedList().add(new int[]{1}));
        String a = new SinglyLinkedList().print(head);
        System.out.println(a);
        Assert.assertEquals("[1]", a);
    }

    @Test
    public void test2(){
        SinglyLinkedList list=new SinglyLinkedList();
        ListNode head = list.add(new int[]{1, 2, 6, 3, 4, 5, 6});
        ListNode listNode = removeElements(head, 6);
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        ListNode prev=curr;
        while(curr.next!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }
           prev=curr;
           curr=curr.next;
        }
        return curr;
    }
}