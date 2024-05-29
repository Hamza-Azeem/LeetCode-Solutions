class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] prefix = new int[s.length()];
        if (s.charAt(0) != t.charAt(0))
            prefix[0] = Math.abs(s.charAt(0) - t.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            prefix[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int l = 0, r = 0, max = 0, sum=0;
        while(r < prefix.length){
            sum+= prefix[r];
            if(sum <= maxCost){
                max = Math.max(max, r - l + 1);
            }else{
                while(sum > maxCost){
                    sum-=prefix[l];
                    l++;
                }
            }
            r++;
        }
        return max;
    }
}