class Solution {
    public int minimumPartition(String s, int k) {
        String ks = Integer.toString(k);
        int count = 0;
        int length = ks.length();
        while(s.length() != 0) {
            int last = s.length();
            int beg = 0;
            if(length <= s.length()){
                beg = s.length() - length;
            }
            
            String innerstr = s.substring(beg,last);
            int parent = Integer.parseInt(innerstr);
            
            if (parent <= k) {
                 s = s.substring(0,beg);
            }else {
                if( ks.length() == 1) {
                    return -1;
                }
                 s = s.substring(0,beg + 1);
            }
            count++;
        }
        return count;
    }
}