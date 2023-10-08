class Solution {
    public long coloredCells(int n) {
        if(n == 1) {
            return 1;
        }
        return (long)(n-1)*(2 + (n-2)*2) + 2*n-1;
    }
}
