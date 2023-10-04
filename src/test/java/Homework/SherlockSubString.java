package Homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SherlockSubString {
    /*
    * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true
    * */

    @Test
    public void test(){
        System.out.println(isValid4("aabbccddeefghi"));
    }
    public static String isValid(String s) {
        // Write your code here
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-97]+=1;
        }
        List<Integer> list=new ArrayList<>();
        System.out.println(Arrays.toString(count));
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                list.add(count[i]);
            }
        }
        int length=s.length();
        int numOfChar=list.size();
        int possibleCharacterCount=length/numOfChar;
        int reminder=length%numOfChar;
        if(reminder<=1)return "YES";
        return "No";
    }

    public static String isValid1(String s) {
        // Write your code here
        int length=s.length();
        int sum=0;
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-97]+=1;
        }
        List<Integer> list=new ArrayList<>();
        System.out.println(Arrays.toString(count));
        for (int j : count) {
            if (j != 0) sum += length % j;
        }
        if(sum<=1)
            return "YES";
        return "NO";

    }

    public static String isValid2(String s) {
        // Write your code here
        int length=s.length();
        int sum=0;
        Integer[] count=new Integer[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-97]+=1;
        }
        Arrays.sort(count, Collections.reverseOrder());
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                if(i<count.length-1)sum+=count[i];
                list.add(count[i]);
            }
        }
        int diff=length-sum;
        if(diff-list.get(0)==1 || diff-list.get(0)==0) return "YES";
        return "NO";
    }

    public static String isValid3(String s) {
        // Write your code here
        int length=s.length();
        int sum=0;
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-97]+=1;
        }
        Arrays.sort(count);
        int[] reverse=reverse(count);
        List<Integer> list=new ArrayList<Integer>();
        for (int j : reverse) {
            if (j != 0) {
                list.add(j);
            }
        }
        for (int i = 0; i < list.size()-1; i++) {
            sum+=list.get(i);
        }
        int diff=length-sum;
        int ans=diff-list.get(0);
        if(ans<0)ans*=-1;
        if(ans ==0 || ans==1) return "YES";
        return "NO";
    }

    public static int[] reverse(int[] array)
    {

        // Length of the array
        int n = array.length;

        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
        return array;
    }

    public static String isValid4(String s) {
        // Write your code here
        int length=s.length();
        int sum=0;
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-97]+=1;
        }
        Arrays.sort(count);
        List<Integer> list=new ArrayList<Integer>();
        for (int j : count) {
            if (j != 0) {
                list.add(j);
            }
        }
        int lengthOfEachChar=s.length()/list.size();
        int counter=0;
        int mismatch=0;
        for(Integer each:list){
            if(each!=lengthOfEachChar){
                counter++;
                mismatch=each;
            }
        }
        int ans=lengthOfEachChar-mismatch;
        if(ans<0)ans*=-1;
        if(counter==1 && ans==1) return "YES";
        return "NO";
    }
}

