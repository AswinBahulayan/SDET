package classRoom;

public class HighestConsecutiveElements {

    public static void main(String[] args) {
        /* System.out.println(highestConsecutiveElements(new int[]{1,5,2,3,7,1},3));
         System.out.println(highestConsecutiveElements(new int[]{-1,-5,-2,-3,-7,-1},3));*/
        System.out.println(Integer.MAX_VALUE+Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(slidingWindow(new int[]{1,2,3,4,5},3));
        System.out.println(slidingWindow(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,3,4,5},3));
//        System.out.println(slidingWindow(new int[]{1,2,3,4,5},6));


    }

    /*
    * 1.input is array of integer and int
    * 2.output is int
    * 3.declare variable for left and right index,count,max
    * 4.iterate the given array
    * 5.if the counter is equal to zero the sum arry of left to sum variable
    * 6.else if count is  less than target then sum array of right and increment right and count
    * 7.else if both condition is not met reset count to zero increment left assign right as left plus 1
    * check if max is less than sum, if yes assign sum to max and make sum to zero
    * 8.finally return the max sum.*/
    public static int highestConsecutiveElements(int[] nums,int target){
        int left=0;
        int right=1;
        int count=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
       while(right<nums.length){
           if(count==0){
               sum+=nums[left];
               count++;
           } else if (count<target) {
               sum+=nums[right];
               right++;
               count++;
           } else{
                count=0;
                left++;
                right=left+1;
                if(max<sum){
                    max=sum;
                }
                sum=0;
           }
       }
       return max;
    }


    private static int slidingWindow(int[] nums, int k){
        //1. one pointer should work
        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];
        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            max = Math.max(currentSum, max);
            currentSum += nums[pointer] - nums[pointer-k];
            pointer++;
        }
        return Math.max(currentSum, max);
    }
    
}
