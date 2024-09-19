class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String x = "";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)){
                x += s.charAt(i);
            }
        }
        int l=0, r = x.length() - 1;
        while(l < r){
            if(x.charAt(l) != x.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}