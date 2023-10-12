package LinkedList;

public class IntersectionOfTwoLinkedList {


    /**https://leetcode.com/problems/intersection-of-two-linked-lists/description/
     1.input is a pair of ListNode with on possible intersection
     2.output is a ListNode
     3.Declare two tem variables for headA and Headb
     4.Iterate tempA throughput tempB until until a equal reference is found
     5.if no equal reference return null */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            while(tempB!=null){
                if(tempA==tempB)return tempA;
                else{
                    tempB=tempB.next;
                }
            }
            tempB=headB;
            tempA=tempA.next;
        }
        return null;
    }
}
