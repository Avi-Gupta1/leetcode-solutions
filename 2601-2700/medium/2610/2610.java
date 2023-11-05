class Solution {
    class pair implements Comparable<pair>{
        int element;
        int count;
        pair(int element,int count) {
            this.element = element;
            this.count = count;
        }

        public int compareTo(pair p) {
            return this.count - p.count;
        }
    }
    public List<List<Integer>> findMatrix(int[] nums) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] farr = new int[201];
        for (int i = 0; i < nums.length; i++) {
            farr[nums[i]]++;
        }
        for (int i = 0; i < farr.length; i++) {
            if(farr[i] != 0) {
                pq.add(new pair(i,farr[i]));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        while(!pq.isEmpty()) {
            pair rem = pq.poll();
            int topKey = rem.count;
            int val = rem.element;
            for (int i = 0; i < topKey; i++) {
                if(ans.size() <= i) {
                    ans.add(new LinkedList<>());
                }
                ans.get(i).add(val);
            }
        }
        System.out.println(ans.size());
        return ans;
    }
}
