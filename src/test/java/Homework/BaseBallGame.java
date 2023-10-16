package Homework;

import org.junit.Test;

import java.util.Collections;
import java.util.Stack;

public class BaseBallGame {

    @Test
    public void test(){
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
    }

    @Test
    public void test1(){
        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }

    @Test
    public void test2(){
        System.out.println(calPoints(new String[]{"1","C"}));
    }

    /**https://leetcode.com/problems/baseball-game/description/
     1.input is a array of Strings
     2.output is an integer
     3.Declare a Stack of integer
     4.iterate the given array
     5.create a switch case with below conditions
     1.if string is "C" then do a pop operation
     2.if string "D" the do a peek and push 2*peek.
     3.if string is "+" then pop last two and store in variables
     4.again insert the values in popped order and finally insert the sum of the last two values
     5.else push the score to stack
     6.finally return the sum of values in the stack */
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for (String e:
             operations) {
            switch (e){
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int peek = stack.peek();
                    stack.push(2*peek);
                    break;
                case "+":
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(b);
                    stack.push(a);
                    stack.push(a+b);
                    break;
                default:
                    stack.push(Integer.parseInt(e));
            }
        }
        return sum(stack);
    }

    public int sum(Stack<Integer> stack){
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
