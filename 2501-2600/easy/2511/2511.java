class Solution {
    public int captureForts(int[] forts) {
        int nextOne = -1;
        int nextOneneg = -1;
        int max = 0;
        for (int i = 0; i < forts.length; i++) {
            if(forts[i] == -1) {
                nextOne++;
                max = Math.max(max,nextOneneg);
                nextOneneg = -1;
                nextOne = 0;
            }else if(forts[i] == 1){
                nextOneneg++;
                max = Math.max(max,nextOne);
                nextOne = -1;
                nextOneneg = 0;
            }else {
                if(nextOne != -1) {
                    nextOne++;
                }
                if(nextOneneg != -1) {
                    nextOneneg++;
                }
            }
        }
        return max;
    }
}
