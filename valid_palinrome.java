class Solution {
    /**
     * Determines if a string is a palindrome, considering only alphanumeric characters
     * and ignoring cases.
     * 
     * @param s the input string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {
        // Initialize two pointers: left pointer starts at beginning, right pointer at end
        int left = 0;
        int right = s.length() - 1;
      
        // Continue comparing characters while pointers haven't crossed
        while (left < right) {
            // Get characters at current positions
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
          
            // Skip non-alphanumeric character on the left
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            }
            // Skip non-alphanumeric character on the right
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            }
            // Compare characters (case-insensitive)
            else if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                // Characters don't match - not a palindrome
                return false;
            }
            else {
                // Characters match - move both pointers inward
                left++;
                right--;
            }
        }
      
        // All alphanumeric characters matched - string is a palindrome
        return true;
    }
}
