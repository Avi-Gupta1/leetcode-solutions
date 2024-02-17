class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == -1) {
                    int r = 0;
                    int c = j;
                    int max = 0;
                    while(r < matrix.length) {
                        max = Math.max(max,matrix[r][c]);
                        r++;
                    }
                    matrix[i][j] = max;
                }
            }
        }

    return matrix;

    }
}
