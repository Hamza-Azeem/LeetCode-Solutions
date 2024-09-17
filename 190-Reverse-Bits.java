public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String result = "";
        for(int i = 0;i<32;i++){
            result += (n >> i) & 1;
        }
        long decimalResult = 0;
        int counter = 0;
        for(int i=result.length() - 1;i>=0;i--){
            decimalResult += Math.pow(2, counter) * (result.charAt(i) - '0');
            counter++;
        }
        return (int)decimalResult;
    }
}
