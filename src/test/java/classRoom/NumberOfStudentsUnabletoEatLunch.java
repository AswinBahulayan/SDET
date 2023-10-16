package classRoom;

import org.junit.Test;

import java.util.*;

public class NumberOfStudentsUnabletoEatLunch {

    /*https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/*/
    @Test
    public void test(){
        countStudents(new int[]{1,1,0,0},new int[]{0,1,0,1});
    }

    @Test
    public void test1(){
        countStudents(new int[]{1,1,1,0,0,1},new int[]{1,0,0,0,1,1});
    }

    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack=new Stack<>();
        Deque<Integer> queue=new ArrayDeque<>();
        for (int i=students.length-1;i>=0;i--) {
            stack.push(sandwiches[i]);
            queue.add(students[i]);
        }
        while(queue.contains(stack.peek())) {
            if (stack.peek().equals(queue.peek())) {
                stack.pop();
                queue.removeFirst();
            } else {
                int replace = queue.removeFirst();
                queue.addLast(replace);
            }
        }
        return queue.size();
    }
}
