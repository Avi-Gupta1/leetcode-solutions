/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            long sum = 0;
            while(size != 0) {
                TreeNode current = q.remove();
                sum += current.val;
                if(current.left != null) {
                    q.add(current.left);
                }
                if(current.right != null) {
                    q.add(current.right);
                }
                size--;
            }
            pq.add(sum);
        }

        if(pq.size() < k) {
            return -1;
        }
        long kMax = -1;
        while(k != 0) {
            kMax = pq.remove();
            k--;
        }

        return kMax;

    }
}
