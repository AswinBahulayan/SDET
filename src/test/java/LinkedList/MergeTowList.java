package LinkedList;

public class MergeTowList {

    /*https://leetcode.com/problems/merge-two-sorted-lists/*/
    /*
    * 1.input is a pair of ListNode
    * 2.output is a ListNode
    * 3.declare temp variable result of type ListNode
    * 4.create another ListNode curr and set to result
    * 5.iterate until list1 and list 2 not equal to null
    * 6.if list1.val is less than or equal to list2.val
    * 7.then set curr.next=list1 and increment list1=list1.next
    * 8.else set curr.next to list2 and increment list2 to list2.next
    * 9.finally return result.next to eliminate 0 */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result=new ListNode();
        ListNode curr=result;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                curr.next=list1;
                list1=list1.next;
            }else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        curr.next = list1 == null ? list2 : list1;
        return result.next;
    }
}
