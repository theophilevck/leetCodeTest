package string;

public class RemovingStarsFromAString {

    //2390. Removing Stars From a String
    //Medium
    //You are given a string s, which contains stars *.
    //
    //In one operation, you can:
    //
    //    Choose a star in s.
    //    Remove the closest non-star character to its left, as well as remove the star itself.
    //
    //Return the string after all stars have been removed.
    //
    //Note:
    //
    //    The input will be generated such that the operation is always possible.
    //    It can be shown that the resulting string will always be unique.


    //Related Topics
    //String
    //Stack
    //Simulation

    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder(s);
        int delete = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                sb.deleteCharAt(i);
                delete++;
            }
            if (s.charAt(i) != '*' && delete > 0) {
                sb.deleteCharAt(i);
                delete--;
            }
        }
        return sb.toString();
    }
}
