class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for (char ch: word.toCharArray()) {
            arr[ch-'a']++;
        }

        Arrays.sort(arr);
        int i = 0;
        int tappings = 0;
        int sum = 0;
        while( arr.length - 1 - i >= 0) {
            if(i%8 == 0) {
                tappings++;
            }
            sum += tappings * arr[arr.length-1-i];
            i++;
        }
        
        return sum;
    }
}
