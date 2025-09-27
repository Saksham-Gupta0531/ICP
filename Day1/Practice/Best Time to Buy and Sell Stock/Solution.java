

class Solution {
    public int maxProfit(int[] prices) {
        int max_p =0 ;
        int curr_p=0;
        int buy = prices[0];
        for (int i=0 ; i< prices.length ;i++){
            if (buy< prices[i]){
                curr_p = prices[i] - buy;
                max_p = Math.max(curr_p , max_p);
            }
            else{
                buy = prices[i];
            }
        }
        return max_p;
    }
}
