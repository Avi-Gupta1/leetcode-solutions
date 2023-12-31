class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] arr = new int[26];

        for (int i = 1; i <=26; i++) {
            arr[i-1] = i;
        }

        for (int i = 0; i < chars.length(); i++) {
            arr[chars.charAt(i)-'a'] = vals[i];
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(arr[i]);
        }
        
        int curr = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            curr += arr[s.charAt(i)-'a'];
            if(curr < 0) {
                curr = 0;
            }
            max = Math.max(max,curr);
        }

        return max;

    }
}
