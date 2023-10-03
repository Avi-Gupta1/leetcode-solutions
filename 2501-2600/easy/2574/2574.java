class Solution {
    public int[] leftRightDifference(int[] nums) {
       int[] finalArr = new int[nums.length];
       int sum = 0;
       for (int i = 1; i < nums.length; i++) {
           sum += nums[i-1];
           finalArr[i] = sum;
       }
        sum = 0;
       for (int i = nums.length-2; i >= 0; i--) {
           sum += nums[i+1];
           finalArr[i] = Math.abs(sum-finalArr[i]);
       }
       return finalArr;
    }
}
