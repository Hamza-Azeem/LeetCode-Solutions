class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        while( i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i) - '0';
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
            }
            if(sum == 2){
                result = '0' + result;
                carry = 1;
            }else if(sum > 2){
                result = '1' + result;
                carry = 1;
            }
            else{
                result = sum + result;
                carry = 0;
            }
            i--; j--;
        }
        if(carry == 1){
            result = '1' + result;
        }
        return result;
    }
}