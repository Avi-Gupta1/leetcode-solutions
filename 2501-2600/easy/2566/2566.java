class Solution {
    public int minMaxDifference(int num) {
        String max = "";
        String min = "";
        boolean found = false;
        String n = Integer.toString(num);

        int  i= 0;
        while( i < n.length()) {
            if(n.charAt(i) == '9'){
                i++;
            }else {
                break;
            }
        }
        boolean skipMax = false;
        boolean skipMin = false;
        if( i < n.length()){
            char replace = n.charAt(i);
            for (i = 0; i < n.length(); i++) {
                if(n.charAt(i) == replace) {
                    String ns = "";
                    ns += n.substring(0,i);
                    ns += '9';
                    ns += n.substring(i+1);
                    n = ns;
                } 
            }
        }
    
        max = n;
        n = Integer.toString(num);
        i= 0;
        while( i < n.length()) {
            if(n.charAt(i) == '0'){
                i++;
            }else {
                break;
            }
        }
        if ( i < n.length()) {
           char replace = n.charAt(i);
            for (i = 0; i < n.length(); i++) {
                if(n.charAt(i) == replace) {
                    String ns = "";
                    ns += n.substring(0,i);
                    ns += '0';
                    ns += n.substring(i+1);
                    n = ns;
                } 
            }
        }

        min = n;
        return Math.abs(Integer.parseInt(max)-Integer.parseInt(min));
    }
}
