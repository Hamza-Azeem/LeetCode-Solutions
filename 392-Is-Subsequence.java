class Solution {
    public boolean isSubsequence(String s, String t) {
        int pt = 0;
        for(int i=0;i<t.length();i++){
            if(pt < s.length() && s.charAt(pt) == t.charAt(i)){
                pt++;
            }else if(pt >= s.length()){
                break;
            }
        }
        return pt == s.length();
    }
}