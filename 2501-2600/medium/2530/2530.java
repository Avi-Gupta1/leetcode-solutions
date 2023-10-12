class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i: nums) {
            pq.add(i);
        }
        long sum = 0;
        while(!pq.isEmpty() && k > 0) {
            int top = pq.poll();
            sum += top;
            pq.add((int) Math.ceil(top / 3.0));
            k--;
        }
        return sum;
    }
}
