class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        if(numOnes >= k) {
            return k;
        }else {
            sum += numOnes;
            k -= numOnes;
        }

        if(numZeros >= k) {
            return sum;
        }else {
            k -= numZeros;
        }

        if(numNegOnes >= k) {
            return sum + k*(-1);
        }else {
            sum += k*(-1);
            k -= numNegOnes;
        }
        return sum;
    }
}
