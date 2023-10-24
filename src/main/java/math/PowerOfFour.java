package math;

public class PowerOfFour {

    //342. Power of Four
    //Easy
    //Given an integer n, return true if it is a power of four. Otherwise, return false.
    //
    //An integer n is a power of four, if there exists an integer x such that n == 4x.

    //Related Topics
    //Math
    //Bit Manipulation
    //Recursion

    public static boolean isPowerOfFour(int n) {

        // If 'n' is 1, it is a power of four
        if (n == 1)
            return true;

        // If 'n' is non-positive, it cannot be a power of four
        if (n <= 0)
            return false;

        // Calculate the logarithm of 'n' with base 4
        double logarithmBase4 = Math.log(n) / Math.log(4);

        // Check if the result of the logarithmic operation is an integer
        return (logarithmBase4 == (int) logarithmBase4);
    }


    public static void main(String[] args) {
        int input = 101;
        System.out.println(isPowerOfFour(input));
    }


}
