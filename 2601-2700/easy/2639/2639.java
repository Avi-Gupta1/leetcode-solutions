class Solution {
    public int width(int max) {
        if(max == 0) {
            return 1;
        }
        int count = 0;
        if(max < 0) {
            count++;
        }
        while(max != 0) {
            max = max/10;
            count++;
        }
        return count;
    }
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];

        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max,width(grid[j][i]));
            }
            ans[i] = max;
        }
        return ans;
    }
}
