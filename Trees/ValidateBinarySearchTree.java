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

// https://leetcode.com/problems/validate-binary-search-tree/

class ValidateBinarySearchTree {
    public boolean isValid(TreeNode root, Integer lower, Integer upper) {
      if(root == null) return true;
      boolean bleft = isValid(root.left, lower, root.val);
      boolean bright = isValid(root.right, root.val, upper);
      if (lower != null && root.val <= lower) return false;
      if (upper != null && root.val >= upper) return false;
      return bleft && bright;
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isValid(root, null, null);
    }
}