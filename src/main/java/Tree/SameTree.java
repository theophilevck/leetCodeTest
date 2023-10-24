package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

    //100. Same Tree
    //Easy
    //Given the roots of two binary trees p and q, write a function to check if they are the same or not.
    //
    //Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

    //Related Topics
    //Tree
    //Depth-First Search
    //Breadth-First Search
    //Binary Tree

    // Definition for a binary tree node.
    public static class TreeNode {
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


    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        Queue<TreeNode> queueP = new LinkedList<>();
        Queue<TreeNode> queueQ = new LinkedList<>();

        queueP.add(p);
        queueQ.add(q);

        while (!queueP.isEmpty() && !queueQ.isEmpty()) {
            TreeNode nodeP = queueP.poll();
            TreeNode nodeQ = queueQ.poll();

            if (nodeP.val != nodeQ.val) {
                return false;
            }

            if (nodeP.left != null && nodeQ.left != null) {
                queueP.add(nodeP.left);
                queueQ.add(nodeQ.left);
            } else if (nodeP.left != null || nodeQ.left != null) {
                return false;
            }

            if (nodeP.right != null && nodeQ.right != null) {
                queueP.add(nodeP.right);
                queueQ.add(nodeQ.right);
            } else if (nodeP.right != null || nodeQ.right != null) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        TreeNode p = new TreeNode();
        p.val = 1;
        p.left = new TreeNode();
        p.left.val = 2;
        //p.right = new TreeNode();
        // p.right.val = 3;
        TreeNode q = new TreeNode();
        q.val = 1;
        //q.left = new TreeNode();
        //q.left.val = 2;
        q.right = new TreeNode();
        q.right.val = 2;
        isSameTree(p, q);

    }

}
