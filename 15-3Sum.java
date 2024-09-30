class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int l=i+1, r= nums.length-1;
            while(l < r)
            {
                int sum = nums[i]+nums[l]+nums[r];
                if(sum < 0)
                {
                    l++;
                }else if(sum > 0)
                {
                    r--;
                }
                else
                {
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])); 
                    if(set.contains(list))
                    {
                        l++;
                        continue;
                    }
                    set.add(list);
                    l++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}