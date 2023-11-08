package arrays;

public class PlusOne {
    //66. Plus One
    //Easy
    //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    //
    //Increment the large integer by one and return the resulting array of digits.

    //Related Topics
    //Array
    //Math

    public int[] plusOne(int[] digits) {

        int carry = 1;
        int[] result = new int[digits.length];

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
        }

        return result;
    }

}
