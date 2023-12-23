package classRoom;

import foundation.ClimbStairs;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductOfEachELementInArray {

    /*
    1.iterate the given array
    2.add the square of each element in the same index
    3.sort the array*/

    @Test
    public void test(){
        System.out.println(Arrays.toString(productOfElements1(new int[]{-7,-3,2,3,11})));
        System.out.println(Arrays.toString(productOfElements1(new int[]{-4,-1,0,3,10})));
    }

    public int[] productOfElements(int[] a){
        for (int i = 0; i <a.length ; i++) {//O(n)
            a[i]=a[i]*a[i];
        }
        Arrays.sort(a);
        return a;
    }

    public int[] productOfElements1(int[] a){
        for (int i = 0; i <a.length ; i++) {//O(n)
            a[i]=a[i]*a[i];
        }
        int[] b=new int[a.length];
        int count=0;
        int left=0,right=a.length-1;
        for (int i = 0; i <a.length-1 ; i++) {
            if(a[left]<a[right]){
                right--;
            }else if(a[right]<a[left]){
                int temp=a[right];
                a[right]=a[left];
                a[left]=temp;
            }
        }
        return a;
    }

}
