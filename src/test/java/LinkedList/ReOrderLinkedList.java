package LinkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReOrderLinkedList {

    @Test
    public void test(){
       ListNode list=new ListNode();
        ListNode head = list.add(Arrays.asList(1, 2, 3, 4));
        reorderList(head);
    }


    /**https://leetcode.com/problems/reorder-list/description/
     1.input is a ListNode
     2.output is a ListNode
     3.create a temp ListNode to store head
     4.iterate the temp Listnode and store in list
     5.Now declare variable
     int i=0;
     int left=0;
     int right=List.size()-1;
     ListNode tail=null;
     6.iterate the list of ListNode
     7.if i is 0 then initialise tail with list.get(left) and increment left
     8.if value of i is even then set tail.next as list.get(right) and decrement right
     9.if odd then set tail.next as list.get(left) and increment right */
    public void reorderList(ListNode head) {
        String sentence ="";
        sentence.replaceAll("\\.", "");
        ListNode temp=head;
        ListNode tail=null;
        List<ListNode> node=new ArrayList<>();
        while(temp!=null){//o[n]->time complexity
            node.add(temp);//o[n]->space complexity
            temp=temp.next;
        }
        int i=0,left=0,right= node.size()-1;
        while(i< node.size()){
            if (i==0){
                tail=node.get(left);
                head=tail;
                left++;
            } else if(i== node.size()-1){
                tail.next=node.get(right);
                tail=tail.next;
                tail.next=null;
                right--;
            }else if ((i+1)%2==0) {
                tail.next=node.get(right);
                tail=tail.next;
                right--;
            } else if ((i+1)%2!=0) {
                tail.next=node.get(left);
                tail=tail.next;
                left++;
            }
            i++;
        }
    }
}
