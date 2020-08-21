package com.example.java.day06;

public class TreeNode {

    public String value;

    public TreeNode left;

    public TreeNode right;

    public void rev(){
        System.out.println(value);
        if(left!=null) left.rev();
        if(right!=null) right.rev();

    }

    public TreeNode(String value) {
        this.value = value;
    }


    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode("A");
        TreeNode treeNode1 = new TreeNode("B");
        treeNode.setLeft(treeNode1);
        treeNode.setRight(new TreeNode("c"));
        treeNode1.setLeft(new TreeNode("d"));
        TreeNode treeNode2 = new TreeNode("e");
        treeNode1.setRight(treeNode2);
        treeNode2.setLeft(new TreeNode("f"));
        treeNode2.setRight(new TreeNode("g"));
        treeNode. rev();
    }
}
