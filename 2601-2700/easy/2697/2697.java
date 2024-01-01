class Solution {
    public String makeSmallestPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while( i < j) {
            char first = s.charAt(i);
            char last = s.charAt(j);
            if(first < last) { 
                s = s.substring(0,j) + first + s.substring(j+1);
            }else if(first > last) {
                s = s.substring(0,i) + last + s.substring(i+1);
            }
            i++;
            j--;
        }
        return s;
    }
}
