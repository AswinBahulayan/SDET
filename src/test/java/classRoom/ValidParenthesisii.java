/*
package classRoom;

import java.util.Stack;

public class ValidParenthesisii {

    public boolean validParenthesisii(String a){
        Stack<Character> stack=new Stack<>();
        int numberOfBrackets=0;
        char[] charArray = a.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
           switch (c){
               case '}':
               case ']':
               case')':
                   stack.push(c);
               case '[':
                   stack.pop();
               case'{':
                   stack.pop();
               case'(':
                   stack.pop();

           }


        }
    }
}
*/
