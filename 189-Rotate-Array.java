class Solution {
    public void rotate(int[] nums, int k) {
        int[] reversed = new int[nums.length];
        while (k >= nums.length) {
            k -= nums.length;
        }
        if (k == 0) {
            return;
        }
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    
        // [1,2,3,4,5,6,7] original array
        // [7,6,5,4,3,2,1] first reverse
        // [5,6,7,4,3,2,1] second reverse
        // [5,6,7,1,2,3,4] third reverse
    }
    public void reverse(int[] arr,int fromIndex ,int toIndex){
        int j = --toIndex;
        int i = fromIndex;
        while(i < j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}