package classRoom;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NumberOfBribes {

    @Test
    public void test() {
        minimumBribes(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));
    }

    /*
    *https://www.hackerrank.com/challenges/new-year-chaos/problem
    * 1.input is a list
    * 2.output is string
    * 3.iterate the list
    * 4.if element at ith index is not equal to ith index plus one then check
    * 5.if ith index minus 1 is equal to i+1.if the condition is satisfied then increment count by 1
    * and swap i-1 and i
    * 6.if condition not satisfied then check if element at index i-2 is equal to i+1
    * 7.if the above condition is satisfied the increment count by 2 and swap i-2 with i
    * and again swap i-2 with i-1
    * 8.if both the conditions are not satisfied return print Too chaotic
    * 9.if the loop is complete print the total count
    * 10. time complexity is o[n] */
    public static void minimumBribes(List<Integer> q) {
        // Write your code here//2, 1, 5, 3, 4
        int bribes=0;
        for(int i=q.size()-1;i>=0;i--){
            if(q.get(i)!=i+1){
                if(q.get(i-1)==i+1){
                    bribes++;
                    q=swap(q, i - 1, i);
                }else if(q.get(i-2)==i+1){
                    bribes+=2;
                    q=swap(q, i - 2, i);
                    q=swap(q, i - 2, i-1);
                }else{
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(bribes);
    }

    public static List<Integer> swap(List<Integer> a,int j,int k){
        int temp=a.get(j);
        a.set(j,a.get(k));
        a.set(k,temp);
        return a;
    }


}
