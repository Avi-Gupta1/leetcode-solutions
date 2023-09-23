class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = 0;
        while(j < nums.length) {
            if(nums[i] < nums[j]) {
                count++;
                i++;
                j++;
            }else if(nums[i] == nums[j]) {
                j++;
            }
        }
        return count;
    }
}
