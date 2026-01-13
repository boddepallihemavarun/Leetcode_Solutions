class Solution {

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }

        current = current * 10 + node.val;

        // If it's a leaf node, return the number formed
        if (node.left == null && node.right == null) {
            return current;
        }

        // Sum from left and right subtrees
        return dfs(node.left, current) + dfs(node.right, current);
    }
}
