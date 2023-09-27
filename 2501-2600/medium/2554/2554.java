class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> banset = new HashSet<>();
        for (int i: banned) {
            banset.add(i);
        }
        System.out.println(banset);
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(sum > maxSum) {
                return count;
            }
            if(!banset.contains(i) && sum + i <= maxSum) {
              sum += i;
              count++;  
            }
        }
        return count;
    }
}
