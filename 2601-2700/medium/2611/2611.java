class Solution {
    class pair implements Comparable<pair> {
        int index;
        int point;
        pair(int index, int point) {
            this.index = index;
            this.point = point;
        }

        public int compareTo(pair p) {
            return this.point - p.point;
        }
    }

    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        boolean[] visited = new boolean[reward1.length];
        int sum = 0;

        for (int i = 0; i < reward1.length; i++) {
            pq.add(new pair(i,reward1[i]-reward2[i]));
        }
        
        while(pq.size() != 0 && k > 0) {
            int index = pq.remove().index;
            sum += reward1[index];
            visited[index] = true;
            k--;
        }

        for (int i = 0; i < reward1.length; i++) {
            if(!visited[i]) {
                sum += reward2[i];
            }
        }

        return sum;
    }
}
