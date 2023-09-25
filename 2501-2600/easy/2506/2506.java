class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            HashSet<Character> alpha = new HashSet<>();
            for (char ch: words[i].toCharArray()) {
               alpha.add(ch);
            }
            for (int j = i+1; j < words.length; j++ ) {
                boolean flag = true;
                HashSet<Character> inneralpha = new HashSet<>();
                for (char innerch: words[j].toCharArray()) {
                    if(!alpha.contains(innerch)) {
                        flag = false;
                        break;
                    }
                    inneralpha.add(innerch);
                }
                if(flag && inneralpha.size() == alpha.size()) {
                    count++;
                }
            }
        }
        return count;
    }
}
