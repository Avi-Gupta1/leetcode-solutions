class Solution {
    public long[] distance(int[] nums) {
        long[] ans = new long[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int last = map.get(nums[i]);
                ans[i] = ans[last] + count[last]*(i-last);
                count[i] = count[last] + 1;
            }else {
                count[i] = 1;
            }
            map.put(nums[i], i);
        }
        long[] revans = new long[nums.length];
        count = new int[nums.length];
        map = new HashMap<>();
        for (int i = nums.length-1; i >= 0; i--) {
            if(map.containsKey(nums[i])) {
                int last = map.get(nums[i]);
                revans[i] = revans[last] + count[last]*(last - i);
                count[i] = count[last] + 1;
            }else {
                count[i] = 1;
            }
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] += revans[i];
        }

        return ans;
    }
}
