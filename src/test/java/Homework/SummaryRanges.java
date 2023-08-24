package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {

    @Test
    public void test(){
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
        Assert.assertEquals(Arrays.asList("0->2","4->5","7"),summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    @Test
    public void test2(){
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
        Assert.assertEquals(Arrays.asList("0","2->4","6","8->9"),summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }

    @Test
    public void test3(){
        System.out.println(summaryRanges(new int[]{-2,-1,1,2,2147483646,2147483647}));
        Assert.assertEquals(Arrays.asList("-2->-1","1->2","2147483646->2147483647"),summaryRanges(new int[]{-2,-1,1,2,2147483646,2147483647}));
    }

    /*
    * 1.input is an array
    * 2.output is a list<String>
    * 3.declare a List<String> to store the summary range
    * 4.declare a int to find the diff between arr[i] and [i+1]
    * 5.if difference is equal to 1 concatenate arr[i] and arr[i+1] using a ";" as separator
    * 6.if difference is not equal to 1 add the string with concatenated array elements to the list
    * and reset the string to null, add arr[i+1] to list
    * 7.finally after all the are added remove repeated elements from the list*/
    public List<String> summaryRanges(int[] nums) {
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

    }
}
