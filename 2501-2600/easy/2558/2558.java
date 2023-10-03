class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> gift = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i: gifts) {
            gift.add(i);
        }
        long count = 0;
        while( k > 0) {
            int max = gift.remove();
            int val = (int) Math.sqrt(max);
            gift.add(val);
            k--;
        }

        while(!gift.isEmpty()) {
            count += gift.remove();
        }

        return count;
    }
}
