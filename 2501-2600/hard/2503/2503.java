class Solution {
    public int[] maxPoints(int[][] a, int[] q) {
        
        int n = a.length;
        int m = a[0].length;
        
        int l = q.length;
        int[][] p = new int[l][2];
        
        for(int i = 0 ; i < l ; i++) {
            
            p[i][0] = i;
            p[i][1] = q[i];
        }
        
        Arrays.sort(p, (o1,o2)-> {
            
            if(o1[1] == o2[1]) {
                
                Integer.compare(o1[0],o2[0]);
            }
            
            return Integer.compare(o1[1],o2[1]);
        }); // sorting query array based on its val and index
        
        PriorityQueue<int[]> qu = new PriorityQueue<>((o1,o2)->{
            
            return Integer.compare(a[o1[0]][o1[1]],a[o2[0]][o2[1]]);
        }); // Created a PQ based on val of grif
        
        qu.add(new int[]{0,0});
        
        boolean[][] v = new boolean[n][m];
        int cnt = 0;
        int idx = 0;
        
        while(qu.size() > 0 && idx < l) { // Keep deleting element of Queue and keep adding them back
            
            int[] f = qu.remove();
            int r = f[0] , c = f[1];
            
            if(v[r][c]) continue;
            
            v[r][c] = true;
            
            if(a[r][c] < p[idx][1]) {
                
                cnt++;
            }
            else{
                
                q[p[idx][0]] = cnt;
                idx++;
                qu.add(f);
                v[r][c] = false;
                continue;
            }
            
            if(c+1 < m && v[r][c+1] == false) qu.add(new int[]{r,c+1});
            if(r+1 < n && v[r+1][c] == false) qu.add(new int[]{r+1,c});
            if(r-1 >=0 && v[r-1][c] == false) qu.add(new int[]{r-1,c});
            if(c-1 >= 0 && v[r][c-1] == false) qu.add(new int[]{r,c-1});
        }
        
        while(idx < l) {   
            q[p[idx][0]] = cnt;
            idx++;
        }
        
        return q;
    }
}
