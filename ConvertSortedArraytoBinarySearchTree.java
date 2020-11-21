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
    public TreeNode createBST(int[] nums, int s, int e) {
       if (s > e) return null;
       int mid = (s+e) /2;
       TreeNode n = new TreeNode(nums[mid]);
       n.left = createBST(nums, s, mid-1);
       n.right = createBST(nums, mid+1, e);
       return n;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        TreeNode node = createBST(nums, 0, n-1);
        return node;
    }
}
// 2nd Approach
     // int n = nums.length;
      // int mid = n/2;
      // TreeNode root = new TreeNode(nums[mid]);
      // TreeNode temp = root;
      // for(int i = 0; i < mid; i++) {
      //     TreeNode node = new TreeNode(nums[i]);
      //     temp.left = node;
      //     temp = temp.left;
      // }
      // temp = root;
      // for(int i= mid+1; i <n; i++) {
      //     TreeNode node = new TreeNode(nums[i]);
      //     temp.right = node;
      //     temp = temp.right;
      // }
