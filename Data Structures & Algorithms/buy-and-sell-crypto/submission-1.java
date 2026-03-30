class Solution {
    public static int maxProfit(int[] prices) {
        int l=0,r=1,max=0;
        for(int i=0;i<prices.length && r<prices.length; i++){
            if(prices[l]>prices[r]){
                l=r;
                r++;
                if(r>=prices.length){
                    break;
                }
            }
            if(prices[r]-prices[l]>max){
                max=prices[r]-prices[l];
            }
            r++;
        }
        return max;
    }
}
