package LeetCodeSolutions;
//https://leetcode.com/problems/symmetric-tree/

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class LCP_22_SymetricTree {

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

        //[
        //      1
        //   2      2
        // 3  4    4 3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);


        boolean res = isSymmetric(root);
        System.out.println("The Tree are same : " + res);

    }

    public boolean isSymmetric(TreeNode root) {
        boolean ret = false;
        int count = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;

        ArrayList<Integer> leftArray = dfsLeft(left);
        ArrayList<Integer> rightArray = dfsRight(right);
        for (int i = 0; i < leftArray.size(); i++) {
            if (leftArray.get(i) != rightArray.get(i)) {
                ret = false;
                break;
            } else {
                count++;
            }
        }
        if (count == leftArray.size()) {
            ret = true;
        }
        return ret;
    }

    public ArrayList<Integer> dfsLeft(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        if (root != null) {
            list.addAll(dfsLeft(root.left));
            list.addAll(dfsRight(root.right));
            list.add(root.val);
        }
        return list;

    }

    public ArrayList<Integer> dfsRight(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.addAll(dfsRight(root.right));
            list.addAll(dfsLeft(root.left));
            list.add(root.val);
        }
        return list;
    }



}
