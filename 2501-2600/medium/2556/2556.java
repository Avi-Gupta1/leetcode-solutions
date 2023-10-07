class Solution {
    public boolean DFS(int[][] grid,int row,int col) {
        if(row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return false;
        }
        if(row == grid.length - 1 && col == grid[0].length - 1) {
            return true;
        }
        grid[row][col] = 0;
        return DFS(grid,row,col+1) || DFS(grid,row+1,col); // Keep going right if there is a path that way and change current point to 0 so that if we traverse that again we dont go through same point if there is no way keep going right will go down.
    }
    public boolean isPossibleToCutPath(int[][] grid) {
        if(!DFS(grid,0,0)) {
            return true;
        }
        grid[0][0] = 1;
        return !DFS(grid,0,0);
    }
}
