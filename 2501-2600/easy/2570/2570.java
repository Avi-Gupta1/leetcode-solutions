class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while((i < nums1.length) && (j < nums2.length)) {
            if(nums1[i][0] < nums2[j][0]) {
                List<Integer> innerList = new ArrayList<>();
                innerList.add(nums1[i][0]);
                innerList.add(nums1[i][1]);
                list.add(innerList);
                i++;
            }else if(nums1[i][0] > nums2[j][0]) {
                List<Integer> innerList = new ArrayList<>();
                innerList.add(nums2[j][0]);
                innerList.add(nums2[j][1]);
                list.add(innerList);
                j++;
            }else {
                List<Integer> innerList = new ArrayList<>();
                innerList.add(nums1[i][0]);
                innerList.add(nums1[i][1]+nums2[j][1]);
                list.add(innerList);
                i++;
                j++;
            }
        }

        while(i < nums1.length) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(nums1[i][0]);
            innerList.add(nums1[i][1]);
            list.add(innerList);
            i++;
        }

        while(j < nums2.length) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(nums2[j][0]);
            innerList.add(nums2[j][1]);
            list.add(innerList);
            j++;
        }
        int[][] ans = new int[list.size()][2];
        i = 0;
        for (List<Integer> l: list) {
            ans[i][0] = l.get(0); 
            ans[i][1] = l.get(1);
            i++;
        }
        return ans;
    }
}
