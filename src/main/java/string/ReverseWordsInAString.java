package string;

public class ReverseWordsInAString {

    //151. Reverse Words in a String
    //Medium
    //Given an input string s, reverse the order of the words.
    //
    //A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
    //
    //Return a string of the words in reverse order concatenated by a single space.
    //
    //Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.


    //Related Topics
    //Two Pointers
    //String


    public String reverseWords(String s) {
        String[] array = s.trim().split("\\s+");
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left].equals(" ")) {
                left++;
                continue;
            }
            if (array[right].equals(" ")) {
                right--;
                continue;
            }
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", array);
    }
}
