package Homework;

import org.junit.Test;

public class MoveZerosToFirst {

    @Test
    public void test(){
        System.out.println(moveZerosToFirst("32400121200"));
    }

    public String moveZerosToFirst(String num){
        int left=0,right=0,index=0;
        char[] charArray = num.toCharArray();
        while(right<num.length()){
            if(charArray[right]!='0'){
                right++;
            }else{
                char temp=charArray[right];
                charArray[right]=charArray[left];
                charArray[left]=temp;
                left++;
                right++;
            }
        }
        return new String(charArray);
    }
}
