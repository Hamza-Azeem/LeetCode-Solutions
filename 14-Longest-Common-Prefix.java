class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        boolean flag = false;
        for(int i=0;i<strs[0].length(); i++){
            for(int j=1;j<strs.length;j++){
                if(i >= strs[j].length()){
                    flag = true;
                    break;
                }
                if(strs[j].charAt(i) != strs[0].charAt(i)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
            result+=strs[0].charAt(i);
        }
        return result;
    }
}