package LinkedList;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RotateLinkedList {

    @Test
    public void test() {
        List<Integer> list3 = Arrays.asList(1, 3, 4, 5);
        ListNode list = new ListNode();
        ListNode add = list.add(list3);
        System.out.println(rotateRight(add, 2));
    }

    @Test
    public void test1() {
        List<Integer> list3 = Arrays.asList(1, 2);
        ListNode list = new ListNode();
        ListNode add = list.add(list3);
        System.out.println(rotateRight(add, 2));
    }

    /*https://leetcode.com/problems/rotate-list/*/

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        if (head.next == null) return head;
        int count = 0;
        ListNode rotate = head;
        ListNode temp = rotate;
        ListNode out = null;
        while (count != k) {
            if (temp.next.next == null) {
                out = temp.next;
                temp.next = null;
                out.next = rotate;
                count++;
                rotate = out;
                temp = rotate;
            } else {
                temp = temp.next;
            }
        }
        return rotate;
    }

    /*
    * 1.input is a ListNode and integer
    * 2.output is a ListNode
    * 3.find the size of the head
    * 4.if K is greater than size then k is K%size
    * 5.Declare variables
    *   ListNode rotate = head;
        ListNode temp = rotate;
        ListNode out = null;
    * 6.iterate until count is equal to K
    * 7. if temp.next.next if null
    * 8.then assign out as temp.next
    * 9.assign temp.next as null
    * 10.Assign out.next as rotate
    * 11.Now reset value of rotate to out and temp to rotate
    * 12.Increment the value of count*/
    public ListNode rotateRight1(ListNode head, int k) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode size = head;
        int s = 0;
        while (size != null) {
            size = size.next;
            s++;
        }
        if (k > s) {
            k = k % s;
        }
        int count = 0;
        ListNode rotate = head;
        ListNode temp = rotate;
        ListNode out = null;
        while (count != k) {
            if (temp.next.next == null) {
                out = temp.next;
                temp.next = null;
                out.next = rotate;
                count++;
                rotate = out;
                temp = rotate;
            } else {
                temp = temp.next;
            }
        }
        return rotate;
    }
}
