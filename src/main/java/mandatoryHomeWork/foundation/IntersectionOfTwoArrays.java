package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfTwoArrays {

    @Test
    public void test(){
        Assertions.assertArrayEquals(new int[]{2},intersection(new int[]{1,2,2,1},new int[]{2,2}));
    }

    @Test
    public void test1(){
        Assertions.assertArrayEquals(new int[]{4,9},intersection(new int[]{4,9,5},new int[]{9,4,9,8,4}));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection=new TreeSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    intersection.add(nums1[i]);
                }
            }
        }
        int[] arr=new int[intersection.size()];
        int i=0;
        for (int  each:
             intersection) {
            arr[i]=each;
            i++;
        }
        return arr;
    }

}
