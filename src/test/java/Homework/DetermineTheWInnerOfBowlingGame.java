package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DetermineTheWInnerOfBowlingGame {

    @Test
    public void test(){
        Assert.assertEquals(1,isWinner(new int[]{9,7,10,7},new int[]{10,2,4,10}));
    }

    @Test
    public void test1(){
        Assert.assertEquals(1,isWinner(new int[]{4,10,7,9},new int[]{6,5,2,3}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(2,isWinner(new int[]{3,5,7,6},new int[]{8,10,10,2}));
    }

    @Test
    public void test3(){
        Assert.assertEquals(0,isWinner(new int[]{2,3},new int[]{4,1}));
    }

    /*1.input is two array of integers of same lengths
    * 2.out is an integer
    * 3.declare variables
    *  int left=0,right=0,sum=0;
    *  boolean isFullPoints=false
    * 4.iterate the array until right less than array length
    * 5.if array at index right is not equal to 10 then add element to sum
    * 6.if array at index right is equal to 10 then make flag to true and add the next twice of next two elements
    * and make flag to false at third element
    * 7.increment right*/
    public int isWinner(int[] player1, int[] player2){
        int sum1 = sumOfPoints(player1);
        int sum2 = sumOfPoints(player2);
        return  sum1>sum2?1:(sum1<sum2?2:0);
    }

    public int sumOfPoints(int[] player) {
        int left=0,right=0,sum=0;
        boolean isFullPoints=false;
        while(right< player.length){
            if(isFullPoints){
                sum+=(2*player[right]);
            }else{
                sum+=player[right];
            }
            if(player[right]==10) {
                left=right;
                isFullPoints=true;
            } else if(right-left>1){
                isFullPoints=false;
            }
            right++;
        }
        return sum;
    }
}
