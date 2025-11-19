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
     * Counts the total number of nodes in a binary tree.
     * Uses recursive approach to traverse the entire tree.
     * 
     * @param root The root node of the binary tree
     * @return The total count of nodes in the tree
     */
    public int countNodes(TreeNode root) {
        // Base case: if the current node is null, return 0
        if (root == null) {
            return 0;
        }
      
        // Recursive case: count current node (1) plus all nodes in left and right subtrees
        // The recursion will traverse every node in the tree exactly once
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
