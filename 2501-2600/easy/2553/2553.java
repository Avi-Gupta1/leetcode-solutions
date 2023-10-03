class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i: nums) {
            String s = Integer.toString(i);
            for (char ch: s.toCharArray()) {
                list.add(ch-'0');
            }
        }
        
        int[] ans = new int[list.size()];
        int j = 0;
        for (int i : list) {
            ans[j] = i;
            j++;
        }
        return ans;

    }
}
