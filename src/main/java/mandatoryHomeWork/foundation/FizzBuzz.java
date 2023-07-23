package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n){
        List<String> fizzbuzz=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i%3 ==0 && i%5==0){
                fizzbuzz.add("fizzBuzz");
            }else if(i%3==0){
                fizzbuzz.add("fizz");
            }else if(i%5==0){
                fizzbuzz.add("buzz");
            }else{
                fizzbuzz.add(String.valueOf(i));
            }
        }
        return fizzbuzz;
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,3,7,8,6};
        int ints = missingNumber(arr);
    }

    public static int missingNumber(int[] nums) {
        int temp=0;
        Arrays.sort(nums);
        List<Integer> sum=new ArrayList<>();
        for (Integer num:
             nums) {
            sum.add(num);
        }
        for (int i = 0; i < sum.size(); i++) {
            if(sum.get(i)!=i){
                return i;
            }else if(i<=sum.size()){
                return sum.size();
            }
        }
        return 0;
    }
}
