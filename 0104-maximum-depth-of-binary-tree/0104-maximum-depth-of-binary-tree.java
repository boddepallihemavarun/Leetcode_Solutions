class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: if tree is empty
        if (root == null) {
            return 0;
        }

        // Find depth of left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Return max depth + 1 (for current node)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}