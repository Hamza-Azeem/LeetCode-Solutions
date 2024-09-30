class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length - 2;i++){
            int l = i+1, r = nums.length-1;
            while(l < r){
                int sum = nums[l] + nums[r] + nums[i];
                if(sum > 0){
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    List<Integer> list = Arrays.asList(nums[l], nums[r], nums[i]);
                    result.add(list);
                    l++;
                }
            }
        }
        List<List<Integer>> output = new ArrayList<>();
        for(List<Integer> l: result){
            output.add(l);
        }
        return output;
    }
}