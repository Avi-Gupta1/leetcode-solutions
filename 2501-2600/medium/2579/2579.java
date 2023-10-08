class Solution {
    public long coloredCells(int n) {
        return Math.abs((long)(n-1)*(2 + (n-2)*2) + 2*n-1);
    }
}
