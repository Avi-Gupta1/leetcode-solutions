class Solution {
    public String removeTrailingZeros(String num) {
        int till_end = num.length();
        for (int i = num.length()-1; i >= 0; i--) {
            char last = num.charAt(i);
            if(last == '0') {
                till_end = i;
            }else {
                break;
            }
        }
        return num.substring(0,till_end);
    }
}
