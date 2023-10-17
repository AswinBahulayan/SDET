package classRoom;

import org.junit.Test;

public class TimeNeededToBuyTickets {

    @Test
    public void test(){
        System.out.println(timeRequiredToBuy(new int[]{2,3,2},2));
    }

    @Test
    public void test1(){
        System.out.println(timeRequiredToBuy(new int[]{5,1,1,1},0));
    }

    /**https://leetcode.com/problems/time-needed-to-buy-tickets/submissions/
     1.input is an array of integer and integer
     2.output is an integer
     3.declare variables count and i
     4.iterate the array until tickets[k] is not equal to zero
     5.increment i until i is equal to length of array else reset i to 0
     6.decrement the value of each element by 1 in each iteration until element at k is 0
     7.count the number of iteration it took to make element at k to 0 and return it*/
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        int i=0;
        while(tickets[k]!=0){
            if(i==tickets.length)i=0;
            tickets[i]-=1;
            if(tickets[i]>=0) count++;
            if(i==k && tickets[k]==0){
                return count;
            }
            i++;
        }
        return 0;
    }
}
