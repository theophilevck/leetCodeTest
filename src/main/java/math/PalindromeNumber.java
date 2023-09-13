package math;

import java.util.ArrayList;

public class PalindromeNumber {

//    9. Palindrome Number
//    Given an integer x, return true if x is a palindrome, and false otherwise.

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        ArrayList<Integer> array = new ArrayList<Integer>();
        do {
            array.add(x % 10);
            x /= 10;
        } while (x > 0);

        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            if (array.get(i) != array.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int input = 121;
        System.out.println(isPalindrome(input));
    }
}
