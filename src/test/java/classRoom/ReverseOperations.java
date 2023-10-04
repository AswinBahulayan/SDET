package classRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseOperations {

    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(Arrays.asList(0,9));
        list.add(Arrays.asList(4,5));
        list.add(Arrays.asList(3,6));
        list.add(Arrays.asList(2,7));
        list.add(Arrays.asList(1,8));
        list.add(Arrays.asList(0,9));
        System.out.println(performOperations(Arrays.asList(9,8,7,6,5,4,3,2,1,0),list));
    }

    public static List<Integer> performOperations(List<Integer> arr, List<List<Integer>> operations) {
        int left=0,right=0;
        for(List<Integer> each: operations){
            left=each.get(0);
            right=each.get(1);
            while(left<right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return arr;
    }

    public static List<Integer> swap(List<Integer> arr,int i,int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
        return arr;
    }
}
