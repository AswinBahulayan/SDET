package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BuyAndSellStock {
    /*
    * 1.input is an array
    * 2. ouput is a int
    * 3.Constraints cannot sell a stock without buying
    * pseudo code***
    * 1. Introduce a linkedHashMap to store the stock price for each day(key is day and value as the price)
    * 2. Find the day with the lowest price in the map
    * 3. if the lowest price is on the last day return 0
    * 4. else remove the entries from the map which have occurred before the lowest price
    * 5. using the current map we can find the day with maximum profit
    * 6. return the difference of price from highest and lowest day*/
    @Test
    public void test(){
        Assertions.assertEquals(5,maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(0,maxProfit(new int[]{7,6,4,3,1}));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit=0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            currentProfit = prices[i]-buyPrice;
            if(currentProfit>maxProfit){
                maxProfit=currentProfit;
            }
        }
        return maxProfit;
    }

    /*public static void main(String[] args) {
        matches(14);
    }

    public static boolean isPowerOfTwo(int n) {
        boolean flag =false;
        while(n%2==0){
            n=n/2;
        }
        return n==1;
    }

    public static int matches(int n){
        int matches=0;
        int team=n;
        while(team>1){
            if(team%2==0){ //14
                team=team/2;
                matches+=team;
            }else{
                matches=matches+((team-1)/2);//3+1 4
                team=(matches/2)+1;
            }
        }
        return matches;
    }*/
}
