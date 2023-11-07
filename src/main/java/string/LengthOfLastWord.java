package string;

public class LengthOfLastWord {
    //58. Length of Last Word
    //Easy
    //Given a string s consists of some words separated by spaces, return the length of the last word in the string.
    //A word is a maximal substring consisting of non-space characters only.

    //Related Topics
    //String

    public int lengthOfLastWord(String s) {

        int result = 0;
        int i = s.length() - 1;
        char current = s.charAt(i);

        while (current == ' ') {
            i--;
            current = s.charAt(i);
        }
        while (current != ' ') {
            result++;
            i--;
            if (i < 0) break;
            current = s.charAt(i);
        }
        return result;

    }

}
