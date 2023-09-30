class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int[] ans = new int[queries.length];
        int i = 0;
        for (int[] query: queries) {
            int left = query[0];
            int right = query[1];
            int countOfLeft = 0;
            int countOfRight = 0;
            HashMap<Integer,Integer> lOne = new HashMap<>();
            int leftCount = 0;
            int rightCount = 0;
            boolean containsParentOtherThanOne = false;
            while(left != 1) {
                lOne.put(left,leftCount);
                left = left/2;
                leftCount++;
            }

            while(right != 1) {
               if(lOne.containsKey(right)) {
                   containsParentOtherThanOne = true;
                   break;
               }
               right = right/2;
               rightCount++;
            }

            if(containsParentOtherThanOne) {
                ans[i]=rightCount + lOne.get(right) + 1;
            }else {
                ans[i] =  rightCount + leftCount +1;
            }
            i++;
        }
        return ans;
    }
}
