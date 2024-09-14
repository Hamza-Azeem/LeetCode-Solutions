class Solution {
    public String reverseWords(String s) {
        String temp = "", result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else {
                if (temp != "") {
                    if (result.length() != 0) {
                        result = temp + " " + result;
                    } else {
                        result = temp;
                    }
                }
                temp = "";
            }
        }
        if (temp != "") {
            if (result.length() != 0) {
                result = temp + " " + result;
            } else {
                result = temp;
            }
        }
        return result;
    }
}