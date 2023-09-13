package arrays;

public class SearchA2DMatrix {

//    74. Search a 2D Matrix
//    You are given an m x n integer matrix matrix with the following two properties:
//    Each row is sorted in non-decreasing order.
//    The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//You must write a solution in O(log(m * n)) time complexity.


    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m - 1;
        while (left != right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][n - 1] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int i = left;
        left = 0;
        right = n - 1;
        while (left <= right) {
            if (matrix[i][left] == target) {
                return true;
            }
            if (matrix[i][right] == target) {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(input,target));
    }
}
