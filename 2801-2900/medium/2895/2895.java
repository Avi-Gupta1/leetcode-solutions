class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks);
        int start = 0;
        int max = 0;
        for (int i = tasks.size()-1; i >= 0; i -= 4) {
            max = Math.max(max,(tasks.get(i) + processorTime.get(start)));
            start ++;
        }
        return max;
    }
}
