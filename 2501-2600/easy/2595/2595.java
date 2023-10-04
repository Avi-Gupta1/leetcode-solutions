class Solution {
    public int[] evenOddBit(int n) {
        int count = 0;
        int even = 0;
        int odd = 0;
        while(n != 0) {
            int rem = n%2;
            if(count%2 == 0) {
                even += rem;
            }else {
                odd += rem;
            }
            n /= 2;
            count++;
        }
        return new int[]{even,odd};
    }
}
