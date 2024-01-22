class Solution {
    public int findChampion(int[][] grid) {
        int[] arr = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    arr[i]++;
                }else {
                    arr[j]++;
                }
            }
        }

        int max = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                ans = i;
                max = arr[i];
            }
        }
        return ans;
    }
}
