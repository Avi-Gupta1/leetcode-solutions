class Solution {
    public int matrixSum(int[][] nums) {
        ArrayList<PriorityQueue<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < nums[i].length; j++) {
                pq.add(nums[i][j]);
            }
            list.add(pq);
        }
        int sum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            int max = 0;
            for (int j = 0; j < list.size(); j++) {
                max = Math.max(list.get(j).poll(), max);
            }
            System.out.println(max);
            sum += max;
        }
        return sum;
    }
}
