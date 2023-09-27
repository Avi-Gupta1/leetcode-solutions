class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int left = 1;
        int right = 1;
        int n = words.length;
        if(target.equals(words[startIndex])) {
            return 0;
        }
        while(left < n && right < n ) {
            String rightElement = "";
            String leftElement = "";
            if(right < n) {
                rightElement = words[(startIndex+right)%n];
            }
            if(left < n) {
                leftElement = words[((startIndex-left)+ n)%n];
            }
            if(target.equals(leftElement)) {
                return left;
            }
            if(target.equals(rightElement)) {
                return right;
            }
            if(left < n) {
                left++;
            }
            if(right < n) {
                right++;
            }
        }
        return -1;

    }
}
