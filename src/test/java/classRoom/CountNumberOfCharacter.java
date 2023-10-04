package classRoom;

import org.junit.Test;

public class CountNumberOfCharacter {

    @Test
    public void test(){
        System.out.println(countNumberOfCharacter("aaabbccaad"));
        System.out.println(countNumberOfCharacter("aaabbcca"));
        System.out.println(countNumberOfCharacter("aaabbccaa"));
        System.out.println(countNumberOfCharacter("aaaabb"));
    }

    /*
     * 1.input is a string
     * 2.output is a string
     * 3.declare variable
     *   int left=0;
     *  int right=1;
     * int count=1;
     * StringBuilder output=new StringBuilder();
     * 4.iterate the given string
     * 5.increment right if a.charAt(left) and right are equal and increment count variable
     * 6.if character at left and right are not equal append to Stringbuilder along with count
     * 7.repeat until right less than string length*/
    public String countNumberOfCharacter(String a) {
        int left = 0;
        int right = 1;
        int count = 1;
        StringBuilder output = new StringBuilder();//o[1]->space complexity
        while (right<a.length()){//o[n]->time complexity
            if(a.charAt(left)==a.charAt(right)){
                right++;
                count++;
            }else{
                output.append(a.charAt(left));
                output.append(count);
                left=right;
                count=0;
            }
        }
        output.append(a.charAt(left));
        output.append(count);
        return output.toString();
    }
}
