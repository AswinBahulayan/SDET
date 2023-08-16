package classRoom;

import org.junit.jupiter.api.Assertions;

public class RemoveDuplicates {

   /* public void test(){
        Assertions.assertEquals(,);
    }*/

    public int[] removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                if (nums[i] != nums[i + 1]) {
                    count++;
                }
            }
        }
        int[] arr = new int[count + 1];
        int indexOfNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                if (nums[i] != nums[i + 1]) {
                    arr[indexOfNums] = nums[i];
                    indexOfNums++;
                }
            }
        }
        return arr;
    }
}
