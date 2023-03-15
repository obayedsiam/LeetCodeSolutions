package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class LCP_23_Level_Wise_Tree_Traversal {

      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public void start(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.left.left = null;
        root.left.right = null;

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> list = levelOrder(root);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        traverse(root, levels, 0);
        return levels;
    }

    private void traverse(TreeNode node, List<List<Integer>> levels, int depth) {
        if (node == null) {
            return;
        }
        if (levels.size() == depth) {
            levels.add(new ArrayList<Integer>());
        }
        levels.get(depth).add(node.val);
        traverse(node.left, levels, depth + 1);
        traverse(node.right, levels, depth + 1);
    }
}
