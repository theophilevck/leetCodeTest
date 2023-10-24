package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    //101. Symmetric Tree
    //Easy
    //Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

    //Related Topics
    //Tree
    //Depth-First Search
    //Breadth-First Search
    //Binary Tree

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

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int currentLength = queue.size();
            ArrayList<Integer> nextLevel = new ArrayList<>();

            for (int i = 0; i < currentLength; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    nextLevel.add(node.left.val);
                    queue.add(node.left);
                } else {
                    nextLevel.add(null);
                }
                if (node.right != null) {
                    nextLevel.add(node.right.val);
                    queue.add(node.right);
                } else {
                    nextLevel.add(null);
                }
            }

            int right = nextLevel.size() - 1;
            int left = 0;

            while (right > left) {
                if (nextLevel.get(left) != nextLevel.get(right)) {
                    return false;
                }
                right--;
                left++;
            }


        }
        return true;
    }


    public static void main(String[] args) {

        TreeNode p = new TreeNode();
        p.val = 1;
        p.left = new TreeNode();
        p.left.val = 2;
        p.right = new TreeNode();
        p.right.val = 2;
        p.left.left = new TreeNode();
        p.left.left.val = 3;
        p.left.right = new TreeNode();
        p.left.right.val = 4;
        p.right.right = new TreeNode();
        p.right.right.val = 3;
        p.right.left = new TreeNode();
        p.right.left.val = 4;

        isSymmetric(p);

    }
}
