package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {

  /*  @Test
    public void test() {
        System.out.println(summaryRanges1(new int[]{0, 1, 2, 4, 5, 7}));
        Assert.assertEquals(Arrays.asList("0->2", "4->5", "7"), summaryRanges1(new int[]{0, 1, 2, 4, 5, 7}));
    }*/

    @Test
    public void test() {
        System.out.println(summaryRanges1(new int[]{0, 1, 2, 4, 5, 6}));
        Assert.assertEquals(Arrays.asList("0->2", "4->5", "7"), summaryRanges1(new int[]{0, 1, 2, 4, 5, 7}));
    }

    @Test
    public void test2() {
        System.out.println(summaryRanges1(new int[]{0, 2, 3, 4, 6, 8, 9}));
        Assert.assertEquals(Arrays.asList("0", "2->4", "6", "8->9"), summaryRanges1(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    @Test
    public void test3() {
        System.out.println(summaryRanges1(new int[]{-2, -1, 1, 2, 2147483646, 2147483647}));
        Assert.assertEquals(Arrays.asList("-2->-1", "1->2", "2147483646->2147483647"), summaryRanges1(new int[]{-2, -1, 1, 2, 2147483646, 2147483647}));
    }

    /*https://leetcode.com/problems/summary-ranges/submissions/
     * 1.input is an array
     * 2.output is a list<String>
     * 3.declare a List<String> to store the summary range
     * 4.declare a int to find the diff between arr[i] and [i+1]
     * 5.if difference is equal to 1 concatenate arr[i] and arr[i+1] using a ";" as separator
     * 6.if difference is not equal to 1 add the string with concatenated array elements to the list
     * and reset the string to null, add arr[i+1] to list
     * 7.finally after all the are added remove repeated elements from the list*/
   /* public List<String> summaryRanges(int[] nums) {
        if(nums.length==1){
            return Arrays.asList(String.valueOf(nums[0]));
        }
        int diff1=0;
        String s="";
        List<String> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length){
                diff1=nums[i+1]-nums[i];
                if(diff1<1)diff1*=-1;
                if(diff1==1){
                    s+=nums[i]+";"+nums[i+1]+";";
                }else{
                    if(s.length()>1) {
                        String[] split=s.split(";");
                        list.add(split[0] + "->" + split[split.length-1]);
                    }else{
                        list.add(String.valueOf(nums[i]));
                    }
                    s="";
                    list.add(String.valueOf(nums[i + 1]));
                }
            }
        }
        if(!s.isEmpty()){
            if(s.length()>1) {
                String[] split=s.split(";");
                list.add(split[0] + "->" + split[split.length-1]);
            }else{
                list.add(s);
            }
        }
        for (int i=0;i<list.size();i++) {
            if(i+1< list.size()) {
                if (list.get(i).equals(String.valueOf(list.get(i + 1).split("->")[0]))) {
                    list.remove(list.get(i));
                }
            }
        }
        return list;

    }*/

    /*https://leetcode.com/problems/summary-ranges/submissions/
     * 1.input is an array
     * 2.output is a list<String>
     * 3.declare a List<String> to store the summary range,pointer for 1 and next index
     * 4.declare a int to find the diff between arr[i] and [i+1]
     * 5.if difference is equal to 1 concatenate arr[i] and arr[i+1] using a ";" as separator
     * 6.if difference is not equal to 1 add the string with concatenated array elements to the list
     * and reset the string to null, add arr[i+1] to list
     * 7.finally after all the are added remove repeated elements from the list*/

    public List<String> summaryRanges1(int[] nums) {
        if(nums.length==0){
            return new ArrayList<>();
        }else if(nums.length==1) return Arrays.asList(String.valueOf(nums[0]));
        int left = 0;
        int right = 1;
        int start = 0;
        int count = 0;
        //String range=0;
        List<String> list = new ArrayList<>();
        while (right < nums.length) {
            if (nums[left] + 1 == nums[right]) {
                left++;//0+1//0+2//0+3
                right++;
                count++;
            } else {
                list=addRanges(list,count,left,start,nums);
                start = right;
                left++;
                right++;
                count = 0;
            }
        }
        list=addRanges(list,count,left,start,nums);
        return list;
    }

    public List<String> addRanges(List<String> list,int count,int left,int start,int[] nums){
        StringBuilder output = new StringBuilder();
        if (count > 0) {
            output.append(nums[start]);
            output.append("->");
            output.append(nums[left]);
            list.add(output.toString());
        } else {
            output.append(nums[start]);
            list.add(output.toString());
        }
        return list;
    }
}
