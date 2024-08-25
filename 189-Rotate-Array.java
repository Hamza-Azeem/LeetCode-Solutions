class Solution {
    public void rotate(int[] nums, int k) {
        int[] reversed = new int[nums.length];
        while (k >= nums.length) {
            k -= nums.length;
        }
        if (k == 0) {
            return;
        }
        int j = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            reversed[j] = nums[i];
            j++;
        }
        for (int i = 0; i < nums.length - k; i++) {
            reversed[j] = nums[i];
            j++;
        }
        for (int i = 0; i < reversed.length; i++) {
            nums[i] = reversed[i];
        }

    }
}