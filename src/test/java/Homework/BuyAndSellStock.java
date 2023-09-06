package Homework;

import org.junit.Assert;
import org.junit.Test;

public class BuyAndSellStock {
    /**
     * 1.input is an array of prices[] of stock for n number of days
     * 2.output is the profit gained by buying the stock at lowest price and selling it in maximum price. So profit will be differnce of selling and buying price
     * 3.declare two variable for buying and selling price
     * 4.The buying price is initialized as max value of integer
     * 5.if prices[i] is less than the buying price then prices[i] is assigned to buying price
     * 6.if prices[i] is greater than buying price it is assigned to selling price variable
     * 7.if there is no pofit then return 0
     */

    @Test
    public void test() {
        Assert.assertEquals(5, maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void test1() {
        Assert.assertEquals(2, maxProfit(new int[]{2, 4, 1}));//2,4,1
        //7,6,5,4,3,2,1
    }

    public int maxProfit(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;
        int sellingPrice = 0;
        int profit=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<buyingPrice){
                buyingPrice=prices[i];
                for (int j =i+1; j <prices.length ; j++) {
                    profit=prices[j]-buyingPrice;
                }
            }
        }
        if (sellingPrice == 0) return 0;
        return sellingPrice - buyingPrice;
    }
}
