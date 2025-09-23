public class Solution {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.trim().isEmpty()) return 0;

        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}
