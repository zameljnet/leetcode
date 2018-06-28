package com.leetcode;

public class DiameterOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int diameter = 0;

    private int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = getDepth(root.left);
        int r = getDepth(root.right);
        diameter = Math.max(diameter, l + r);
        return Math.max(l, r) + 1;
    }
    public int diameterOfBinaryTree(DiameterOfBinaryTree.TreeNode root) {
        getDepth(root);
        return diameter;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(treeNode));
    }
}
