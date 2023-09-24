class Solution {
    HashSet<Character> set;
    public Boolean isVowel(HashSet<Character> vowel,String str) {
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        
        if(vowel.contains(first) && vowel.contains(last)) {
            return true;
        }
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int[] ans = new int[queries.length];
        int[] samplearr = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if(isVowel(set,words[i])) {
                samplearr[i]++;
                if(i > 0) {
                    samplearr[i] = samplearr[i] + samplearr[i-1];
                }
            }else{
                if(i > 0)samplearr[i] = samplearr[i-1];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int beg = queries[i][0];
            int end = queries[i][1];
            if(beg > 0) {
                ans[i] = samplearr[end] - samplearr[beg-1];
            }else {
                ans[i] = samplearr[end];
            }
        }
        return ans;

    }
}
