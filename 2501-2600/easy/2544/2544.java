class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        String val = Integer.toString(n);
        Boolean isPositive = true;
        for (char ch: val.toCharArray()) {
            if(isPositive) {
                count += (ch-'0');
            }else {
                count -= (ch-'0');
            }
            isPositive = !isPositive;
        } 
        return count;
    }
}
