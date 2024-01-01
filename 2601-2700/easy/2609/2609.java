class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int zero = 0;
        int one = 0;
        int max = 0;
        for (char ch: s.toCharArray()) {
            if(ch == '0') {
                if(one > 0) {
                    one = 0;
                    zero = 1;
                }else {
                    zero++;
                }
            }else {
                if(zero > 0) {
                    one++;
                    max = Math.max(max,2*Math.min(one,zero));
                }else {
                    zero = 0;
                    one = 0;
                }
            }
        }
        return max;
    }
}
