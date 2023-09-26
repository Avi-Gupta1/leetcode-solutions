class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left;  i <= right; i++) {
            String word = words[i];
            char firstChar = word.charAt(0); 
            char lastChar = word.charAt(word.length()-1);
            if((firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') && (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u')) {
                count++;
            }
        }
        return count;
    }
}
