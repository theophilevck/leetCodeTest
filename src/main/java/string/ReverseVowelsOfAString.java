package string;

public class ReverseVowelsOfAString {

    //345. Reverse Vowels of a String
    //Given a string s, reverse only all the vowels in the string and return it.
    //
    //The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (isVowel(chars[left]) && isVowel(chars[right])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            } else if (isVowel(chars[left]) && !isVowel(chars[right])) {
                right--;
            } else if (!isVowel(chars[left]) && isVowel(chars[right])) {
                left++;
            } else {
                left++;
                right--;
            }
        }
        return new String(chars);

    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
