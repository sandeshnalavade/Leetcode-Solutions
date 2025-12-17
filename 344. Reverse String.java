class Solution {
    /**
     * Reverses the input character array in-place using two-pointer technique.
     * Time Complexity: O(n), where n is the length of the array
     * Space Complexity: O(1), as we only use constant extra space
     * 
     * @param s The character array to be reversed in-place
     */
    public void reverseString(char[] s) {
        // Initialize two pointers: left starting from beginning, right from end
        int left = 0;
        int right = s.length - 1;
      
        // Continue swapping until the pointers meet in the middle
        while (left < right) {
            // Swap characters at left and right positions
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
          
            // Move pointers towards the center
            left++;
            right--;
        }
    }
}
