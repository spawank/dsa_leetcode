// https://leetcode.com/problems/symmetric-tree/

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

// Recursive Approach

// class Solution {
//     public boolean symmetric(TreeNode root1, TreeNode root2) {
//         if(root1 == null && root2 == null) return true;
//         if(root1 == null || root2 == null) return false;
//         return (symmetric(root1.left, root2.right)) && (symmetric(root1.right, root2.left)) &&                          (root1.val == root2.val);
//     }
//     public boolean isSymmetric(TreeNode root) {
//         if (root == null) return true;
//         return symmetric(root.left, root.right);
//     }
// }

// Iterative Approach

// With Stack

// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         if(root == null) return true;
//         Stack<TreeNode> st = new Stack<TreeNode>();
//         st.push(root);
//         st.push(root);
//         while(!st.empty()) {
//             TreeNode root1 = st.pop();
//             TreeNode root2 = st.pop();
//             if (root1.left != null && root2.right != null) {
//                st.push(root1.left);
//                st.push(root2.right);  
//             }
//             if (root1.right != null && root2.left != null) {
//                st.push(root1.right);
//                st.push(root2.left); 
//             }
//             if (root1.right == null ^ root2.left == null) return false;
//             if (root1.left == null ^ root2.right == null) return false;
//             if (root1.val != root2.val) return false;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        st.push(root);
        while(!st.empty()) {
            TreeNode root1 = st.pop();
            TreeNode root2 = st.pop();
            if (root1 == null && root2 == null) continue;
            if (root1 == null || root2 == null) return false;
            if (root1.val != root2.val) return false;
            st.push(root1.left);
            st.push(root2.right);  
            st.push(root1.right);
            st.push(root2.left);
        }
        return true;
    }
}

// with Queque

// public boolean isSymmetric(TreeNode root) {
//     Queue<TreeNode> q = new LinkedList<>();
//     q.add(root);
//     q.add(root);
//     while (!q.isEmpty()) {
//         TreeNode t1 = q.poll();
//         TreeNode t2 = q.poll();
//         if (t1 == null && t2 == null) continue;
//         if (t1 == null || t2 == null) return false;
//         if (t1.val != t2.val) return false;
//         q.add(t1.left);
//         q.add(t2.right);
//         q.add(t1.right);
//         q.add(t2.left);
//     }
//     return true;
// }

