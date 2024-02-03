class Solution {
    public int beautifulSubstrings(String s, int k) {
        int count = 0;
        int[] vowels = new int[s.length()];
        int[] consonants = new int[s.length()];

        char[] ch = {'a','e','i','o','u'};
        HashSet<Character> set = new HashSet<Character>();
        for(char c: ch) {
            set.add(c);
        }

        for (int i = 0; i < s.length() ; i++) {
            char c  = s.charAt(i);
            if( i == 0) {
                 if(set.contains(c)){
                     vowels[i] = 1;
                 }else {
                     consonants[i] = 1;
                 }
                 continue;
            }
            if(set.contains(c)) {
                vowels[i] = vowels[i-1] + 1;
                consonants[i] = consonants[i-1];
            }else {
                consonants[i] = consonants[i-1] + 1;
                vowels[i] = vowels[i-1];
            }
        }

        
        for (int i = 0; i < s.length();i++) {
         for (int j = i; j <  s.length(); j++) {
           
             int v = 0;
             int c = 0;
            if( i == 0) {
                v = vowels[j];
                c = consonants[j];
            }else {
                if( i == j) {
                    v = vowels[j] - vowels[j-1];
                    c = consonants[j] - consonants[j-1];
                }else {
                    v = vowels[j] - vowels[i-1];
                    c = consonants[j] - consonants[i-1];
                }
            }
            if(v == c && (v*c)%k == 0) {
                count++;
            }
         }
        }
        return count;
    }
}
