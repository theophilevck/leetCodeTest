package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {

    //119 . Pascal's Triangle II
    //Easy
    //Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
    //
    //In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

    //Related Topics
    //Array
    //Dynamic Programming

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();


        result.add(new ArrayList<>());
        result.get(0).add(1);

        if (rowIndex == 0) return result.get(0);


        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> new_row = new ArrayList<>();
            new_row.add(1);

            for (int j = 1; j < prevRow.size(); j++) {
                new_row.add(prevRow.get(j - 1) + prevRow.get(j));

            }
            new_row.add(1);
            result.add(new_row);
        }
        return result.get(rowIndex );

    }

    public static void main(String[] args) {
        int input = 1;
        System.out.println(getRow(input));
    }

}
