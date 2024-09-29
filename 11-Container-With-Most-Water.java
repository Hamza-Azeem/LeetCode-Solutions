class Solution {
    public int maxArea(int[] height) {
        int max = -1, left=0, right = height.length - 1;
        while(left < right){
            int contains = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, contains);
            if(height[left] >= height[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
}