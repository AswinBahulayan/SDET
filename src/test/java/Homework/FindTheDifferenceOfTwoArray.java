/*
package Homework;

import org.junit.Test;

import java.util.*;

public class FindTheDifferenceOfTwoArray {

    @Test
    public void test(){
        System.out.println(findDifference(new int[]{1,2,3},new int[]{2,4,6}));
        System.out.println(findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2}));
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        for (int e:
             nums1) {
            set1.add(e);
        }
        for (int e:
                nums2) {
            set2.add(e);
        }
        for (Integer e:
             set1) {
            if(!set2.contains(e)){
                list1.add(e);
            }
        }
        for (Integer e:
                set2) {
            if(!set1.contains(e)){
                list2.add(e);
            }
        }
        list.add(list1);
        list.add(list2);
        return list;
    }

    public List<List<Integer>> findDifference1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left=0,right=0;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        while (left<nums1.length && right<nums2.length){
            if(nums1[left]<nums2[right]){
                if(list1.isEmpty() || list1.get(list1.size()-1)!=nums1[left]){
                    list1.add(nums1[left]);
                }
                left++;
            } else if (nums1[left]>nums2[right]) {
                if(list2.isEmpty() || list2.get(list2.size()-1)!=nums2[right]){
                    list1.add(nums2[right]);
                }
                right++;
            }else {
                left++;
                right++;
            }
        }
    }
}
*/
