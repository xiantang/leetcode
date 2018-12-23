package ArrayList;

public class BestTimetoBuyandSellStockwithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int hold = -prices[0];
        int cash = 0;
        for(int i = 1;i< prices.length;i++){
            // 卖掉股票此时的最大利润
            cash = Math.max(cash,hold+prices[i]-fee);
            // 卖掉原来股票之后买此股票
            hold = Math.max(hold,cash-prices[i]);
        }
        return cash;


    }

    public static void main(String[] args) {
        int [] nums =  {1, 3, 2, 8, 4, 9};
        new BestTimetoBuyandSellStockwithTransactionFee().maxProfit(nums, 2);
    }

}
