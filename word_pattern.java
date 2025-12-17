class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split the string into words by spaces
        String[] words = s.split(" ");
      
        // Check if pattern length matches the number of words
        if (pattern.length() != words.length) {
            return false;
        }
      
        // Map to store pattern character to word mapping
        Map<Character, String> patternToWord = new HashMap<>();
        // Map to store word to pattern character mapping (for bijection check)
        Map<String, Character> wordToPattern = new HashMap<>();
      
        // Iterate through each pattern character and corresponding word
        for (int i = 0; i < words.length; i++) {
            char patternChar = pattern.charAt(i);
            String word = words[i];
          
            // Check if the current mapping is consistent with existing mappings
            // If patternChar exists in map, it should map to the current word
            // If word exists in map, it should map to the current patternChar
            if (!patternToWord.getOrDefault(patternChar, word).equals(word) || 
                wordToPattern.getOrDefault(word, patternChar) != patternChar) {
                return false;
            }
          
            // Update both mappings
            patternToWord.put(patternChar, word);
            wordToPattern.put(word, patternChar);
        }
      
        return true;
    }
}
