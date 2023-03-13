package LeetCodeSolutions;

//https://leetcode.com/problems/same-tree/

import com.sun.source.tree.Tree;

public class LCP_21_SameBinaryTree {

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
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left =  null;//new TreeNode(2);
        q.right = new TreeNode(2);

        boolean res = isSameTree(p, q);
        System.out.println("The Tree are same : " + res);

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean ret = true;

        if (isBothGotValue(p, q)) {
            if (p.val != q.val) ret = false;
            else ret = isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
        }
        else if(isBothNull(p,q)) ret = true;
        else ret = false;

        return ret;
    }

    public boolean isBothGotValue(TreeNode p, TreeNode q) {
        if (p != null && q != null) return true;
        else return false;
    }

    public boolean isBothNull(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else return false;
    }
}
