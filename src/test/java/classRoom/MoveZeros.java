package classRoom;

import org.junit.Test;

import java.util.Arrays;

public class MoveZeros {

    @Test
    public void test() {
        System.out.println(Arrays.toString(moveZeroes(new int[]{1,0,5})));
    }

    @Test
    public void test1() {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0,1,0,3,12})));
    }

    @Test
    public void test2() {
        System.out.println(Arrays.toString(moveZeroes(new int[]{1,1,0,3,4,0,5})));
    }

    @Test
    public void test3() {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0,0,1,3,4,0,5})));
    }
    /*
    * 1.input is an array
    * 2.output is also and array
    * 3.Condition is to move zeroes to the last without using nexted loop
    * 4.take two int variables left and right with value 0 and 1
    * 5.iterate the until right is less that length of the array
    * 6.if array of left and array of right is equal to 0 then increment right
    * 7.else swap arry of left with array of rigth and increment left,right
    * 8.iterate until right is less array length*/

    public static  int[] moveZeroes(int[] a){
        int left=0;
        int right=1;
        while (right<=a.length-1){//o[n]
            if(a[left]==0 && a[right]==0){
                right++;
            } else if((a[left]!=0 && a[right]==0)) {
                left++;
                right++;
            } else if ((a[left]==0 && a[right]!=0)) {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;right++;
            } else{
                left+=2;
                right+=2;
            }
        }
        return a;
    }
}
