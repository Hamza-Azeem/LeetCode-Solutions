class Solution {
    public int maxProfit(int[] prices) {
        int slow = 0, fast = 1, max = 0;
        while (slow < fast && fast < prices.length) {
            int profit = prices[fast] - prices[slow];
            if (profit >= 0) {
                if (max < profit) {
                    max = profit;
                }
                fast++;
            } else {
                slow++;
                fast++;
            }
        }
        slow = 0;
        fast = slow + 1;
        int sum = 0;
        while (slow < fast && fast < prices.length) {
            int profit = prices[fast] - prices[slow];
            if (profit >= 0) {
                sum += prices[fast] - prices[slow];
                slow = fast;
                fast++;
            } else {
                slow++;
                fast++;
            }
        }
        return Math.max(max, sum);
    }

}