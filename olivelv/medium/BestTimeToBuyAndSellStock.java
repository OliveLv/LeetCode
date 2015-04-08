package olivelv.medium;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月8日 下午10:30:19
 */
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         if(prices.length<=1)return 0;
         for(int i=0;i<prices.length;i++){
        	 if(prices[i]<min)min=prices[i];
        	 if(prices[i]-min>max)max=prices[i]-min;
        	 
         }
         return max;
	}
}
