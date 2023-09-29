package arrays;

public class ContainerWithMostWater {

    //11. Container With Most Water
    //Medium
    //You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    //
    //Find two lines that together with the x-axis form a container, such that the container contains the most water.
    //
    //Return the maximum amount of water a container can store.
    //
    //Notice that you may not slant the container.

    //Related Topics
    //Array
    //Two Pointers
    //Greedy

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while (left < right) {
            int leftValue = height[left];
            int rightValue = height[right];
            int testArea = 0;
            if (leftValue < rightValue) {
                testArea = (right - left) * leftValue;

                left++;
            } else {
                testArea = (right - left) * rightValue;
                right--;
            }
            if (testArea > area) {
                area = testArea;
            }
        }
        return area;
    }
}
