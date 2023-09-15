package Homework;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAdditionToMakeValidString {

    //*
   // https://leetcode.com/problems/minimum-additions-to-make-valid-string/submissions/
    // 1.input is a String
    // 2.output is an integer
    // 3.convert the string into an charArray
    // 4.iterate through the array and check if character abc are place consecutively.
    // 5.if so make character at i , i-1, i-2 to 0
    // 6.now check if ab,bc,ac is place consecutively in the array
    // 7.if so make i-1,i to zero and increment count by 1
    // 8.now check for character a , b , c and if character is present increment count by 2
    // 9.finally return total count.*/

    @Test
    public void test(){
        Assert.assertEquals(4,addMinimum("aaabc"));
    }

    public int addMinimum(String word) {
//        word=word.replaceAll("abc","");
        char[] a=word.toCharArray();
        for (int i = 2; i < a.length ; i++) {
            if(a[i-2]=='a' && a[i-1]=='b' && a[i]=='c'){
                a[i-2]='0';
                a[i-1]='0';
                a[i]='0';
            }
        }
        String[] compare={"ab","bc","ac"};
        char[] compare2={'a','b','c'};
        int count=0;
        for(int i=1;i<a.length;i++){
            if(a[i-1]==compare[0].charAt(0)
                    && a[i]==compare[0].charAt(1) ){
                a[i-1]='0';a[i]='0';
                count++;
            }else if(a[i-1]==compare[1].charAt(0)
                    && a[i]==compare[1].charAt(1)){
                a[i-1]='0';a[i]='0';
                count++;
            }else if(a[i-1]==compare[2].charAt(0)
                    && a[i]==compare[2].charAt(1)){
                a[i-1]='0';a[i]='0';
                count++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==compare2[0] ){
                count+=2;
            }else if(a[i]==compare2[1] ){
                count+=2;
            }else if(a[i]==compare2[2] ){
                count+=2;
            }
        }
        return count;
    }
}
