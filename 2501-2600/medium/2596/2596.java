class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int[][] knightsMove = {{-2,1},{-1,2},{2,1},{1,2},{2,-1},{1,-2},{-1,-2},{-2,-1}};
        int i = 0;
        int j = 0;
        int count = 0;
        Boolean valid = false;
        while(i >= 0 && i < grid.length && j >=0 && j < grid.length && grid[i][j] == count && count < grid.length*grid.length) {
            boolean foundCount = false;
            count++;
            for (int km = 0; km < knightsMove.length; km++ ) {
                int nr = i + knightsMove[km][0];
                int nc = j + knightsMove[km][1];
                
                if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid.length) {
                    if(grid[nr][nc] == count){
                        i = nr;
                        j = nc;
                        foundCount = true;
                        System.out.print(i+" ");
                        System.out.println(j);
                        valid = true;
                        break;
                    }
                }
            }
            if(!foundCount && count < grid.length*grid.length){
                return foundCount;
            }
        }

        return valid;

    }
}
