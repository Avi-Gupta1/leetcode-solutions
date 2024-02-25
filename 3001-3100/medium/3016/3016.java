class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for (char ch: word.toCharArray()) {
            arr[ch-'a']++;
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for (int i: arr) {
            pq.add(i);
        }
        int visited = 0;
        int tappings = 1;
        int sum = 0;
        while(pq.size() != 0) {
            if(visited == 8) {
                visited = 0;
                tappings ++;
            }
            sum += tappings * pq.remove();
            visited++;
        }
        return sum;
    }
}
