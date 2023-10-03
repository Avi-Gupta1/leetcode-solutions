class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long concat = 0;
        int i = 0;
        int j = nums.length-1;
        while(i < j) {
            int first = nums[i];
            int last = nums[j];
            String f = Integer.toString(first);
            String l = Integer.toString(last);
            String total = f+l;
            concat += Integer.parseInt(total);
            i++;
            j--;
        }
        if( i == j) {
            concat += nums[i];
        }
        return concat;
    }
}
