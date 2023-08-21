package Homework;

import org.junit.Assert;
import org.junit.Test;

public class FlowerBed {


    /**
     1.input is an integer array
     2.input consist of 1 and 0 only. 1 means planted and 0 means not planted.
     3.planting can only done in adjacent plots.
     Ex. if array[0] is planted i.e 1. array[1] cannot be planted
     4.iterate the array. find the index of 1.
     5.if n is next to a index where the value is 1 then return true
     6.else false */

    @Test
    public void test(){
        Assert.assertEquals(true,canPlaceFlowers(new int[]{0,0,1,0,0},1));
    }

    @Test
    public void test1(){
        Assert.assertEquals(true,canPlaceFlowers(new int[]{0,0,1,0,0},2));
    }

    @Test
    public void test2(){
        Assert.assertEquals(false,canPlaceFlowers(new int[]{0,0,1,0,0},3));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(n>0) {
                if (i == 0 && flowerbed.length == 1 && flowerbed[i] == 0) {
                    n--;
                } else if (i > 0 && i + 1 < flowerbed.length) {
                    if (flowerbed[i] != 1 && flowerbed[i + 1] != 1 && flowerbed[i - 1] != 1) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } else if (i + 1 >= flowerbed.length) {
                    if (flowerbed[i] != 1 && flowerbed[i - 1] != 1) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } else {
                    if (flowerbed[i] != 1 && flowerbed[i + 1] != 1) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }
        return n==0;
    }
}
