package classRoom;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {

    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(2,2,1,3,2),4,2));
    }

    /*
    https://www.hackerrank.com/challenges/the-birthday-bar/problem
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     *1.iterate the given list until window les than m and find the sum
     *2.if sum is equal to d
     *3.iterate the list again from the window until its is less than size of list
     *4.through out the while loop add index at window and subtract the value at index window - m and check step number 2 */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int window=0,sum=0,count=0;//o[1]-space compleixty
        while(window<m){
            sum+=s.get(window);
            window++;
        }
        if(sum==d){
            count++;
        }
        while(window<s.size()){//o[n]-time complexity
            sum+=s.get(window)-s.get(window-m);
            if(sum==d){
                count++;
            }
            window++;
        }
        return count;
    }
}
