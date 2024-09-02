class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int size=0;
        for(int i=chars.length - 1 ;i>-1;i--){
            if(chars[i] == ' '){
                if(size == 0)
                    continue;
                break;
            }
            size++;
        }
        return size;
    }
}