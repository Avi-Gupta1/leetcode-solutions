class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Long> set = new HashSet<>();
        for (int i: nums) {
            set.add(i*1l);
        }
        Arrays.sort(nums);
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            boolean contains = false;
            int count = 0;
            while(set.contains(val*1l*val*1l)) {
                contains = true;
                count++;
                val = val*val;
            }
            if(contains) {
                count++;
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
