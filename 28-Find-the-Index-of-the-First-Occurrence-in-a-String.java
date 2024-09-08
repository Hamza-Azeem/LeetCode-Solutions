class Solution {
    public int strStr(String haystack, String needle) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<=haystack.length() - needle.length();i++){
            if(!map.containsKey(haystack.substring(i, i + needle.length()))){
                map.put(haystack.substring(i, i+needle.length()), i);
            }
        }
        if(map.containsKey(needle)){
            return map.get(needle);
        }
        return -1;
    }
}