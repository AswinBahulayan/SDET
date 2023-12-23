package Homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {

    /*https://leetcode.com/problems/number-of-recent-calls/description/*/
    public static void main(String[] args) {
        RecentCounter counter=new RecentCounter();
        System.out.println(counter.ping(1));
        System.out.println(counter.ping(100));
        System.out.println(counter.ping(3001));
        System.out.println(counter.ping(3002));
    }

    Deque<Integer> queue;
    public RecentCounter() {
        queue=new ArrayDeque<>();
    }

    public int ping(int t) {
        int start=t-3000;
        queue.add(t);
        while(queue.peek()<start){
            queue.remove();
        }
        return queue.size();
    }
}
