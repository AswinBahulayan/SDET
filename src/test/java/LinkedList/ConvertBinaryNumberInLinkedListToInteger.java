package LinkedList;


/**https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 1.input is a ListNode
 2.output is a int
 3.Declare a StringBuilder to store the value from each ListNode
 4.iterate until head is null
 5.Convert the value from Stringbuilder to decimal*/
public class ConvertBinaryNumberInLinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        StringBuilder builder=new StringBuilder();
        while(head!=null){
            builder.append(head.val);
            head=head.next;
        }
        return Integer.parseInt(builder.toString(),2);
    }
}
