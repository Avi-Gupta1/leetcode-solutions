class Solution {
    public int maxOperations(int[] nums) {
        int prev = 0;
        int count = 0;
        for (int i = 0; i < nums.length-1; i+=2) {
            int f = i;
            int s = i+1;
            if(prev == 0) {
                prev = nums[f]+nums[s];
                count++;
            }else if(prev == nums[f] + nums[s]) {
                count++;
            }else {
                break;
            }
        }

        return count;
    }
}
