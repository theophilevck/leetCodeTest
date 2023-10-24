package Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ValidateBinaryTreeNodes {


    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        //The method creates a boolean array called visited with n elements, and initializes all elements to false. This array is used to keep track of which nodes have been visited during a breadth-first search of the tree.
        boolean[] visited = new boolean[n];

        //The method loops through the leftChild array and sets the corresponding element in the visited array to true for each non-null value in the leftChild array.

        for (int i : leftChild) {
            if (i != -1) visited[i] = true;
        }

        //The method loops through the rightChild array and sets the corresponding element in the visited array to true for each non-null value in the rightChild array.
        for (int i : rightChild) {
            if (i != -1) visited[i] = true;
        }
        //The method initializes a counter variable called count to 0, and a variable called root to -1.
        //The method loops through the visited array and checks if each element is false. If an element is false, it means that the corresponding node has not been visited during the previous breadth-first search, and therefore must be the root node. The method increments the count variable and sets the root variable to the index of the current element.
        //If the count variable is not equal to 1, it means that there is either no root node or more than one root node, and the method returns false.
        int count = 0;
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                root = i;
                count++;
            }
        }
        if (count != 1) return false;

        //The method creates a Queue object called q and adds the root node to the queue.
        //The method resets the visited array to all false values.
        //The method enters a loop that continues until the q queue is empty.
        Queue<Integer> q = new LinkedList<>();
        q.add(root);
        Arrays.fill(visited, false);
        visited[root] = true;

        //Inside the loop, the method removes the first node from the q queue and checks its left and right children.
        //If a child node is not null and has already been visited, it means that there is a cycle in the tree, and the method returns false.
        //If a child node is not null and has not been visited, the method adds the child node to the q queue and sets the corresponding element in the visited array to true.
        while (!q.isEmpty()) {
            int node = q.poll();
            if (leftChild[node] != -1) {
                if (visited[leftChild[node]]) return false;
                q.add(leftChild[node]);
                visited[leftChild[node]] = true;
            }
            if (rightChild[node] != -1) {
                if (visited[rightChild[node]]) return false;
                q.add(rightChild[node]);
                visited[rightChild[node]] = true;
            }
        }
        boolean check = true;

        //After the loop has finished, the method loops through the visited array and checks if every element is true. If any element is false, it means that there is at least one disconnected node in the tree, and the method returns false.
        for (boolean visit : visited) check = check && visit;
        return check;
    }
}


