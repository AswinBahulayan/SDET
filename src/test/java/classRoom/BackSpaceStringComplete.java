package classRoom;

import org.junit.Test;

import java.util.Stack;

public class BackSpaceStringComplete {

    @Test
    public void test(){
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }

    @Test
    public void test1(){
        System.out.println(backspaceCompare("ab##","c#d#"));
    }

    @Test
    public void test2(){
        System.out.println(backspaceCompare("a#c","b"));
    }

    /*https://leetcode.com/problems/backspace-string-compare/description/
    * 1.input is pair of strings
    * 2.output is boolean
    * 3.declare two StringBuilder variables to store the characters in s and t
    * 4.declare two stack to insert the characters of s,t
    * 5.if character at ith index is # then pop the element in stack if stack not empty
    * 6.finally pop each element added to stack and append it to string builder and check if
    * both the contents are equal and return it*/
    public boolean backspaceCompare(String s, String t) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        Stack<Character> stacks=createStack(s);
        Stack<Character> stackt=createStack(t);
        if(stackt.size()==stacks.size()){
            while (!stackt.isEmpty()){
                a.append(stacks.pop());
                b.append(stackt.pop());
            }
        }else{
            return false;
        }
        return a.toString().equals(b.toString());
    }

    public Stack<Character> createStack(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack;
    }
}
