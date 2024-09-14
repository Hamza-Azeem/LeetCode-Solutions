class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        Arrays.sort(strs);
        for(int i=0;i<Math.min(strs[0].length(), strs[strs.length - 1].length());i++){
            if(strs[0].charAt(i) != strs[strs.length - 1].charAt(i)){
                break;
            }
            result += strs[0].charAt(i);
        }
        return result;
    }
}