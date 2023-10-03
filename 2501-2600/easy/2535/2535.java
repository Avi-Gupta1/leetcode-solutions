class Solution {
    public int differenceOfSum(int[] nums) {
        int sum_val = 0;
        int sum_digit = 0;

        for (int i: nums) {
            sum_val += i;
            while(i != 0) {
                sum_digit += i%10;
                i /= 10;
            }
        }

        return Math.abs(sum_val - sum_digit);
    }
}
