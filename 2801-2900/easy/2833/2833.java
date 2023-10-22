class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int ns = 0;
        for (char ch: moves.toCharArray()) {
            if(ch == 'L') {
                left++;
            }else if(ch == 'R') {
                right++;
            }else if(ch == '_') {
                ns++;
            }
        }

        int max = Math.abs(left-right);
        return max + ns;
    }
}
