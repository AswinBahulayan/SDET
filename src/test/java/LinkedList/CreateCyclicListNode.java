package LinkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
public class CreateCyclicListNode {

    @Test
    public void test(){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        ListNode node=new ListNode();
        ListNode head=node.add(list);
        create(head);
    }

    public ListNode create(ListNode head){
        ListNode temp=head;
        ListNode temp2=head;
        int size=0;
        Random random=new Random();
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        int node = random.nextInt(0, size);
        for(int i=0;i<node;i++){
            temp2=temp2.next;
        }
        temp.next=temp2;
        return head;
    }
}
