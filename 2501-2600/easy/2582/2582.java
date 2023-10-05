class Solution {
    public int passThePillow(int n, int time) {
        int times = time/(n-1); 
        if(times%2 == 0){
            return 1+time%(n-1);
        }else {
            return n - time%(n-1);
        }
    }
}
