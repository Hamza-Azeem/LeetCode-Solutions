class Solution {
    public int maxProfit(int[] prices) {
        int slow = 0, fast = 1, max = 0;
        while (slow < fast && fast < prices.length) {
            int profit = prices[fast] - prices[slow];
            if (profit >= 0) {
                max = Math.max(max, profit);
                fast++;
            } else {
                slow = fast;
                fast++;
            }
        }
        return max;
    }
}