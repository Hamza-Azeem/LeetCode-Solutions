class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int slow=0, fast=0, sum=0;
        while(fast < nums.length && min != 1){
            sum += nums[fast];
            if(sum >= target){
                min = Math.min(min, (fast - slow + 1));
                sum -= nums[slow];
                sum -= nums[fast];
                slow++;
            }else{
                fast++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}