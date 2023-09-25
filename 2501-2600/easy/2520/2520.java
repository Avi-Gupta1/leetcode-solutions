class Solution {
    public int countDigits(int num) {
        String digits = Integer.toString(num);
        int count = 0;
        for (char ch: digits.toCharArray()) {
            int val = ch-'0';
            if(num%val == 0) {
                count++;
            }
        }
        return count;
    }
}
