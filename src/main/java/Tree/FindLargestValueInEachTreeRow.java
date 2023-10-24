package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {

    //515. Find Largest Value in Each Tree Row
    //Medium
    //Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
    //Related Topics
    //Tree
    //Depth-First Search
    //Breadth-First Search
    //Binary Tree


    //Definition for a binary tree node.
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

    class Solution {
        public List<Integer> largestValues(TreeNode root) {

            if (root == null)  return new ArrayList<Integer>();;

            ArrayList<Integer> result = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int currentLength = queue.size();
                int currMax = Integer.MIN_VALUE;

                for (int i = 0; i < currentLength; i++) {
                    TreeNode node = queue.remove();
                    currMax = Math.max(currMax, node.val);

                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }

                result.add(currMax);
            }

            return result;
        }
    }
}
