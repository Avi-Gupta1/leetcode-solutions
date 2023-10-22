class Solution {
    class pair implements Comparable<pair> {
        int step;
        int row;
        int col;
        pair(int step,int row,int col) {
            this.step = step;
            this.row = row;
            this.col = col;
        }

        public int compareTo(pair p) {
            return this.step - p.step;
        }
    }
    public int minimumTime(int[][] grid) {
        if(grid[0][1] > 1 && grid[1][0] > 1) return -1;
        int[][] direction = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(0,0,0));
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[0][0] = true;
        while(pq.size() != 0) {
            pair rem = pq.poll();
            for (int[] dir: direction) {
                int r = rem.row + dir[0];
                int c = rem.col + dir[1];
                if(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && !visited[r][c]) {
                    visited[r][c] = true;
                    int step = rem.step + 1;
                    if(grid[r][c] > step) {
                        step = (grid[r][c] - step)%2 + grid[r][c];
                    }
                    if(r == grid.length-1 && c == grid[0].length-1) {
                        return step;
                    }
                    pq.add(new pair(step,r,c));
                }
            }
        }
        return -1;
    }
}
