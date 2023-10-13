package math;

public class IntegerBreak {

    //Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
    //
    //Return the maximum product you can get.
    //Medium
    //Related Topics
    //Math
    //Dynamic Programming


    //we want to only use 2s and 3s
    public int integerBreak(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int quotient = n / 3;
        int remainder = n % 3;
        if (remainder == 0) {
            return (int) Math.pow(3, quotient);
        } else if (remainder == 1) {
            return (int) (Math.pow(3, quotient - 1) * 4);
        } else {
            return (int) (Math.pow(3, quotient) * 2);
        }
    }

}
