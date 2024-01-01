class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if(set.contains(nums2[j])) {
                return nums2[j];
            }
        }
        return Math.min(nums1[0],nums2[0])*10 + Math.max(nums1[0],nums2[0]);
    }
}
