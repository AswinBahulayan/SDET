package LinkedList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNode {
    ListNode next;
    int val;

    public ListNode(){

    }

    public ListNode(int value) {
        this.val = value;
        next = null;
    }

    //14 ,null
    //20, node4
    public ListNode(int value, ListNode next) {
        this.val = value;
        this.next = next;
    }
    public void add(int a){
        ListNode temp=null;
        if(next==null){
            next=new ListNode(a);
        }else{
            temp=new ListNode(a,next);
            next=temp;
        }
    }

    public ListNode add(List<Integer> list){
        ListNode head=null;
        ListNode tail=null;
        for (Integer each:
             list) {
            if (head == null) {// we are trying to add the first element
//                head = tail = new ListNode(each);
                tail = new ListNode(each);
                head = tail;
            } else {
//          tail = tail.next = new Node(value);
                tail.next = new ListNode(each);  // 11 -> 43
                tail = tail.next;
            }
        }
        return head;
    }

    public ListNode remove(ListNode a,int value){
        ListNode temp=a, out=null;
        ListNode currentHead = null, previousNode = null;
       while (temp!=null){
           if(temp.val!=value){
               out=new ListNode(temp.val,out);
           }
           temp=temp.next;
       }
//       out=new ListNode(temp.val,out);
       return out;
    }


    public void display(){
        ListNode temp=next;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
       // System.out.println(temp.val);
    }

    public void display(ListNode node){
       ListNode temp=node;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        //System.out.println(temp.val);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2,6,3,4,5,6};
        List<Integer> one=Arrays.asList(1,3,4,5);
        List<Integer> we=Arrays.asList(1,6,7,8);
        List<Integer> list1 = Arrays.asList(1, 2, 6, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(1,2,4);
        List<Integer> list3 = Arrays.asList(1,3,4);
        ListNode list=new ListNode();
        ListNode add = list.add(list2);
        ListNode add2 = list.add(list3);
        ListNode listNode = mergeTwoLists(add, add2);

        ;
        /*for (int j : a) {
            list.add(j);
        }*/
//        ListNode remove = list.removeElements1(add, 6);
//        list.display(remove);
    }

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

    public ListNode removeElements1(ListNode head, int val) {
        ListNode temp=new ListNode();
        temp=head;
        while(temp!=null){
            if(temp.val==val){
                temp=temp.next;
            }
            temp=temp.next;
        }
        return head;
    }

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