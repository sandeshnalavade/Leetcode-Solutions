class Solution {
    /**
     * Calculates the maximum depth of a binary tree.
     * The maximum depth is the number of nodes along the longest path 
     * from the root node down to the farthest leaf node.
     * 
     * @param root The root node of the binary tree
     * @return The maximum depth of the tree
     */
    public int maxDepth(TreeNode root) {
        // Base case: if the node is null, depth is 0
        if (root == null) {
            return 0;
        }
      
        // Recursively calculate the depth of the left subtree
        int leftDepth = maxDepth(root.left);
      
        // Recursively calculate the depth of the right subtree
        int rightDepth = maxDepth(root.right);
      
        // The depth of current node is 1 plus the maximum depth of its subtrees
        return 1 + Math.max(leftDepth, rightDepth);
    }
}