package LeetCodeSolutions;

import java.util.List;

public class LECP_24_Max_Depth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void start() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.left.left = null;
        root.left.right = null;

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int maxHeight = maxDepth(root);
        System.out.println(maxHeight);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}
