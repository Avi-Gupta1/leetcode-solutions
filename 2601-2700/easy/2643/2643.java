class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                mat[i][j] += mat[i][j-1]; 
            }
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < mat.length; i++) {
            if(max < mat[i][mat[0].length-1]) {
                max = mat[i][mat[0].length-1];
                index = i;
            }
        }

        return new int[]{index,max};

    }
}
