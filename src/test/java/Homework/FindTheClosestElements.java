package Homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindTheClosestElements {


    @Test
    public void test(){
        System.out.println(findClosestElements(new int[]{1,2,3,4,5},4,3));
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0,right=0,index=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){//0[n]-tc
            index++;
            if(arr[i]==x)break;
        }
        if(index<k){
            left=0;
            right=index+1;
            while (right<arr.length){
                if(arr[left]<arr[right]){
                    list.add(arr[left]);
                    left++;
                }else{
                    list.add(arr[right]);

                }
            }
        }else if(index-1==k){
            for(int i=0;i<index;i++){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
