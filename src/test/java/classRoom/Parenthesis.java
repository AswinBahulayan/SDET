package classRoom;

import org.junit.Test;

import java.util.Stack;

public class Parenthesis {

    @Test
    public void test1(){
        System.out.println(isValid("()[]{}"));
    }

    @Test
    public void test2(){
        System.out.println(isValid("()"));
    }

    @Test
    public void test3(){
        System.out.println(isValid("(]"));
    }

    public boolean isValid(String s) {
        char[] a=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (char e:
             a) {
            switch (e) {
                case '(':
                case'{':
                case '[':
                    stack.push(e);
                    break;
                case ')':
                case '}':
                case ']':
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
}
