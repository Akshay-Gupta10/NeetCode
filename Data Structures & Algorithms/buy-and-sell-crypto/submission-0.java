class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n=prices.length;

        int last=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<last){
                last=prices[i];
            }
            profit=Math.max(profit,prices[i]-last);
        }
        return profit;
    }
}
