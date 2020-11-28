// https://leetcode.com/problems/binary-tree-inorder-traversal/
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

//iteratively

class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> ls = new LinkedList();
      Stack<TreeNode> stack = new Stack<TreeNode>();
      while((root != null) || !stack.empty()) {
         while (root != null) {
           stack.push(root);
           root = root.left;
         }
         root = stack.pop();
         ls.add(root.val);
         root = root.right;
      }
      return ls;
    }    
}

// // Recursion:
// class Solution {
//     public List<Integer> inorder(TreeNode root, List<Integer> ls) {
//         if (root == null) return ls;
//         inorder(root.left, ls);
//         ls.add(root.val);
//         inorder(root.right, ls);
//         return ls;
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//       List<Integer> ls = new LinkedList();
//       return inorder(root, ls); 
//     }
// }