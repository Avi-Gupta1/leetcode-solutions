class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count = 0;
        for (int i = 0; i < (nums.length - pattern.length); i++) {
            boolean chill = true;
            for (int j = 0; j < pattern.length; j++) {
                if(pattern[j] == 1) {
                    if(nums[i+j+1] <= nums[i+j]) {
                        chill = false;
                        break;
                    } 
                }else if(pattern[j] == -1) {
                    if(nums[i+j+1] >= nums[i+j]) {
                        chill = false;
                        break;
                    } 
                }else {
                    if(nums[i+j+1] != nums[i+j]) {
                        chill = false;
                        break;
                    } 
                }
            }
            if(chill) {
                System.out.println(nums[i]);
                count++;
            }
        }
        return count;
    }
}
