class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int[] arr = new int[score.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            arr[i] = score[i][k];
            map.put(arr[i],i); 
        }
        Arrays.sort(arr);
        int[][] nr = new int[score.length][score[0].length];
        for (int i = 0; i < nr.length; i++) {
            int index = map.get(arr[nr.length-i-1]);
            int[] innerarr = score[index];
            for (int j = 0; j < score[0].length; j++ ) {
                nr[i][j] = innerarr[j];
            }
        }

        return nr;
    }
}
