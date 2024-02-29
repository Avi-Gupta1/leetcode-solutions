class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        if(nums.length%2 != 0) {
            return false;
        }

        int[] n = new int[101];

        for (int i: nums) {
            n[i]++;
        }
        int count = 0;
        for (int i : n) {
            if(i != 0) {
                if(i > 2) {
                    return false;
                }
                count++;
            }
        }

        return true;
    }
}
