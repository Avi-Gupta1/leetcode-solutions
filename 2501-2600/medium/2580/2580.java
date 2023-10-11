class Solution {
    class pair implements Comparable<pair>{
        int start;
        int end;
        public pair(int start,int end) {
            this.start = start;
            this.end  = end;
        }
        public int compareTo(pair p) {
            return this.start-p.start;
        }
    }

    public int pow(int a, int b, int m){
        if(b==0)
            return 1;
        if(b==1)
            return a;
        Long res=new Long(pow(a,b/2,m));
        res=(res*res)%m;
        if(b%2==1){
            res=(res*a)%m;
        }
        return res.intValue();
    }

    public int countWays(int[][] ranges) {
        pair[] p = new pair[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            p[i] = new pair(ranges[i][0],ranges[i][1]);
        }
        Arrays.sort(p);
        int count = 0;
        for (int i = 0; i < p.length; i++) {
            boolean temp = false;
            int max = p[i].end;
            while(i+1 < p.length && max >= p[i+1].start) {
                max = Math.max(max,p[i+1].end);
                i++;
            }
            count++;
        }
        if(count == 1) {
            return 2;
        }
        System.out.println(count);
        return pow(2,count,1000000007);
    }
}
