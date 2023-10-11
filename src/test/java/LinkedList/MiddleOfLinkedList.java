package LinkedList;

public class MiddleOfLinkedList {
    /*https://leetcode.com/problems/middle-of-the-linked-list/*/
    /**
     1.input is a ListNode
     2.Output is listNode
     3.find the size of the input node using a temp Listnode
     4.to find size make size as size/2
     5.now iterate head until count variable not eqaul to size
     6.return listnode */
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
}
