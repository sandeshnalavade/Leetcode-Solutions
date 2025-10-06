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
    /**
     * Finds the minimum depth of a binary tree.
     * The minimum depth is the number of nodes along the shortest path 
     * from the root node down to the nearest leaf node.
     * 
     * @param root The root node of the binary tree
     * @return The minimum depth of the tree, or 0 if the tree is empty
     */
    public int minDepth(TreeNode root) {
        // Base case: empty tree has depth 0
        if (root == null) {
            return 0;
        }
      
        // If left subtree is null, only consider right subtree
        // We must reach a leaf node, so we continue down the right path
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
      
        // If right subtree is null, only consider left subtree
        // We must reach a leaf node, so we continue down the left path
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }
      
        // If both children exist, find the minimum depth between them
        // Add 1 to account for the current node
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
