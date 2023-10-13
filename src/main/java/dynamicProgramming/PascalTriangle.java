package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    //118. Pascal's Triangle
    //Easy
    //Given an integer numRows, return the first numRows of Pascal's triangle.
    //
    //In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


    //Related Topics
    //Array
    //Dynamic Programming



    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        result.add(new ArrayList<>());
        result.get(0).add(1);


        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> new_row = new ArrayList<>();
            new_row.add(1);

            for (int j = 1; j < prevRow.size(); j++) {
                new_row.add(prevRow.get(j - 1) + prevRow.get(j));

            }
            new_row.add(1);
            result.add(new_row);
        }
        return result;
    }
}
