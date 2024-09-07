class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> map = Map.of(
                'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        char[] chars = s.toCharArray();
        int prev = 10000;
        for(char c: chars){
            int curr = map.get(c);
            if(curr <= prev){
                sum+= curr;
            }else{
                sum -= prev;
                sum += (curr - prev);
            }
            prev = curr;
        }
        return sum;
    }
}