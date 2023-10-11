package LinkedList;

public class RemoveElements {

    /*https://leetcode.com/problems/remove-linked-list-elements/*/
    /*
    * 1.input is a ListNode and integer
    * 2.output is a ListNode
    * 3.declare variables
    * ListNode out=new ListNode();
        out.next=head;
        ListNode curr=head;
        ListNode prev=out;
      4.iterate the curr until curr not equal to null
      5.if curr.val is equal to the expected val then set prev.next to curr.next
      6.else set prev to prev.next
      7.increment curr to curr.next
      8.finally return out.next*
    **/
    public ListNode removeElements(ListNode head, int val) {
        ListNode out=new ListNode();
        out.next=head;
        ListNode curr=head;
        ListNode prev=out;
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }else{
                prev=prev.next;
            }
            curr=curr.next;
        }
        return out.next;
    }
}
