package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BuildAnArrayWithStackOperations {

    //1441. Build an Array With Stack Operations
    //Medium
    //You are given an integer array target and an integer n.
    //
    //You have an empty stack with the two following operations:
    //
    //    "Push": pushes an integer to the top of the stack.
    //    "Pop": removes the integer on the top of the stack.
    //
    //You also have a stream of the integers in the range [1, n].
    //
    //Use the two stack operations to make the numbers in the stack (from the bottom to the top) equal to target. You should follow the following rules:
    //
    //    If the stream of the integers is not empty, pick the next integer from the stream and push it to the top of the stack.
    //    If the stack is not empty, pop the integer at the top of the stack.
    //    If, at any moment, the elements in the stack (from the bottom to the top) are equal to target, do not read new integers from the stream and do not do more operations on the stack.
    //
    //Return the stack operations needed to build target following the mentioned rules. If there are multiple valid answers, return any of them.

    //Related Topics
    //Array
    //Stack
    //Simulation

    public List<String> buildArray(int[] target, int n) {


        HashSet<Integer> targetSet = new HashSet<>();
        for (int num : target) {
            targetSet.add(num);
        }

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= target[target.length - 1]; i++) {
            if (targetSet.contains(i)) {
                result.add("Push");
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }

}
