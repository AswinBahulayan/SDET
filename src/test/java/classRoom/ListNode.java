package classRoom;

import java.util.Arrays;
import java.util.List;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }



    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        ListNode head=null;
        ListNode node=null;
        for (Integer each:
             list) {
            head=
            node=new ListNode(each,head);
        }




    }

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

}
