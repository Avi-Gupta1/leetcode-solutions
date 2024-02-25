class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];

        for (int i: nums) {
            count[i]++;
        }

        int max = 0;
        for (int i: count) {
            max = Math.max(max,i);
        }
    
        int sum = 0;
        for (int i: count) {
            if(i == max) {
                sum += max;
            }
        }
        return sum;
    }
}
