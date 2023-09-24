class Solution {
    public long findScore(int[] nums) {
        boolean[] checkDone = new boolean[nums.length];
        TreeMap<Integer,PriorityQueue<Integer>> tree = new TreeMap<>();
        long score = 0;
        for (int i = 0; i < nums.length; i++) {
            if(tree.containsKey(nums[i])) {
                PriorityQueue<Integer> list = tree.get(nums[i]);
                list.add(i);
                tree.put(nums[i], list);
            }else {
                PriorityQueue<Integer> list = new PriorityQueue<>();
                list.add(i);
                tree.put(nums[i], list);
            }
        }

        while(tree.size() != 0) {
            int smallestelement = tree.firstKey();
            PriorityQueue<Integer> smallestElementIndex = tree.get(smallestelement);
            int firstindexleft = smallestElementIndex.poll();
            if(!checkDone[firstindexleft]) {
                 score += smallestelement;
                 int oneLeftIndex = firstindexleft - 1;
                 int oneRightIndex = firstindexleft + 1;
                 if(oneLeftIndex >= 0 && !checkDone[oneLeftIndex]){
                     checkDone[oneLeftIndex] = true;
                 }
                 if(oneRightIndex < nums.length && !checkDone[oneRightIndex]){
                     checkDone[oneRightIndex] = true;
                 }
            checkDone[firstindexleft] = true;
            }
           if(smallestElementIndex.size() == 0) {
               tree.remove(smallestelement);
           }
        }
    return score;

    }
}
