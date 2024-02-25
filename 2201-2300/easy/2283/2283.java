class Solution {
    public boolean digitCount(String num) {
        int[] total = new int[10];

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            total[ch-'0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if(total[i] != (ch-'0')) {
                return false;
            }
        }

        return true;
    }
}
