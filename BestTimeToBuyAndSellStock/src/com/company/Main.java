package com.company;

public class Main {

    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int minCurr = Integer.MAX_VALUE;

            for(int i = 0; i != prices.length; i++){
                if(prices[i] > minCurr){
                    maxProfit = Math.max(maxProfit, prices[i] - minCurr);
                }
                else minCurr = prices[i];
            }

            return maxProfit;
        }
    }
}
