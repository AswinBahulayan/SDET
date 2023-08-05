package mandatoryHomeWork.Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageValueOfEvenNumbers {
    /*
    * 1.iterate the array
    * 2.check if the element in array are divisible by 3 and get the count of numbers which are divisble by 3
    * 3.add the numbers which are divisible by 3 and divide it by count*/
    @Test
    public void test(){
        Assertions.assertEquals(9,averageValue(new int[]{1,3,6,10,12,15}));
    }

    public int averageValue(int[] nums) {
        int rem=0;
        int count=0;
        int sum=0;
        int remOfTwo=0;
        for (int i = 0; i < nums.length; i++) {
            rem=nums[i]%3;
            remOfTwo=nums[i]%2;
            if(rem==0 && remOfTwo==0){
                sum+=nums[i];
                count++;
            }
        }
        if(sum>0) {
            return sum / count;
        }else{
            return 0;
        }
    }
}
