package math;

public class CountNumberOfHomogenousSubstrings {

    //1759. Count Number of Homogenous Substrings
    //Medium
    //Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 109 + 7.
    //
    //A string is homogenous if all the characters of the string are the same.
    //
    //A substring is a contiguous sequence of characters within a string.

    //Related Topics
    //Math
    //String


    public int countHomogenous(String s) {
        final int mod = 1000000007; //10^9 + 7

        int result = 0;
        int streak = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                streak++;
            } else streak = 1;
            result = (result + streak)% mod;
        }
        return result ;

    }

}
