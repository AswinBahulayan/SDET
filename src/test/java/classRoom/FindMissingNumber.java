package classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMissingNumber {

    /*1.Assuming there missing number always
    * 2.therefore length of the array is length +1
    * 3.then sum of all the number including the number that is missing is length(length+1)/2
    * 4.The difference of sum of all the number and the existing sum is the missing number*/

    @Test
    public void test(){
        Assertions.assertEquals(2,findMissingNumber(new int[]{1,4,3}));
    }

    public int findMissingNumber(int[] arr){
        int[] newArr=new int[arr.length+1];
        int length=arr.length;
        int sumOfArr=length*(length+1);
        sumOfArr=sumOfArr/2;
        int sumOfActualArr=0;
        for (int i = 0; i < arr.length; i++) {
            sumOfActualArr+=arr[i];
        }
        int missingNumber=sumOfActualArr-sumOfArr;
        return missingNumber;
    }
}
