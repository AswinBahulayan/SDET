package classRoom;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HackerRankInString {

    @Test
    public void test(){
        Assert.assertEquals("YES",hackerrankInString("hereiamstackerrank"));
    }

    @Test
    public void test2(){
        Assert.assertEquals("NO",hackerrankInString("hackerworld"));
    }

    // Write your code here
    /*1.input is a String
    2.output is a string
    3.intiate a string with value hackerrank, declare a boolean var with value false.
    4.iterate the above string over the input string and compare each character
    5.if ith the character from target string matches with jth character of input string set a boolean variable to true and strore the value of j+1 in a int variable to start the next iteration of the nexted loop from the next character adjacent to the character of input string compared in previous iteration
    6. break the inner loop
    7. if the boolean is false return "NO"
    8.Reset the value of boolean to false in next ietration
    9.if whole iteration is complete return "YES"
    10.time complexity is o[n*m]*/
    public static String hackerrankInString(String s) {
        String target="hackerrank";
        int k=0;
        for (int i = 0; i < target.length(); i++) {//o[n]
            boolean flag=false;
            for (int j = k; j < s.length(); j++) {//o[m]
                if(target.charAt(i)==s.charAt(j)){
                    flag=true;
                    k=j+1;
                    break;
                }
            }
            if(!flag){
                return "NO";
            }
        }
        return "YES";
    }
}
