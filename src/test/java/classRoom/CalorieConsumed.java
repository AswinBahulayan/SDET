package classRoom;

import org.testng.annotations.Test;

public class CalorieConsumed {

    /*
    * 1.input is a int[], int , int ,int
    * 2.output is an integer
    *  Variable:
    *       int totalCalorie
    *       int sumOfCalorie
    *       int count
    * 3.iterate through the given array
    * 4.inside the above iteration create a while loop to sum the
    * calories in a given intervals of days based on value of k
    * 5.after each iteration compare the sum with lower and upper
    * and increment or decrement a variable if sum is greater or lesser than upper or lower
    * 6.after completion of the iteration return the total calorie */

    @Test
    public void test(){
        System.out.println(calorieConsumed(new int[]{1,2,3,4,5},1,3,3));
        System.out.println(calorieConsumed(new int[]{3,2},2,0,1));
        System.out.println(calorieConsumed(new int[]{6,5,0,0},2,1,5));
    }

    /*
     * 1.input is a int[], int , int ,int
     * 2.output is an integer
     *  Variable:
     *       int totalCalorie
     *       int sumOfCalorie
     *       int count
     * 3.iterate through the given array
     * 4.inside the above iteration create a while loop to sum the
     * calories in a given intervals of days based on value of k
     * 5.after each iteration compare the sum with lower and upper
     * and increment or decrement a variable if sum is greater or lesser than upper or lower
     * 6.after completion of the iteration return the total calorie */
    public int calorieConsumed(int[] a,int k,int lower,int upper){
       int totalCalorie=0;
        for(int i=0;i<a.length;i+=k){//0[n]
            int count=0;
            int sum=0;
            while(count!=k){//o[m]
                sum+=a[i+count];
                count++;
            }
            if(sum>upper)totalCalorie++;
            if(sum<lower)totalCalorie--;
        }
        return totalCalorie;
    }
}
