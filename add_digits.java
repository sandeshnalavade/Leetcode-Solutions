class Solution {
    /**
     * Computes the digital root of a non-negative integer.
     * The digital root is obtained by iteratively summing all digits
     * until a single digit remains.
     * 
     * Mathematical insight: The digital root follows a pattern based on modulo 9:
     * - If num == 0, result is 0
     * - If num % 9 == 0 (and num != 0), result is 9
     * - Otherwise, result is num % 9
     * 
     * The formula (num - 1) % 9 + 1 elegantly handles all cases:
     * - Maps multiples of 9 to 9 instead of 0
     * - Preserves the modulo 9 value for all other numbers
     * - Special case: when num is 0, returns 0 (since -1 % 9 + 1 = 0)
     * 
     * @param num The non-negative integer to process
     * @return The digital root (single digit sum) of the input number
     */
    public int addDigits(int num) {
        // Handle edge case explicitly for clarity
        if (num == 0) {
            return 0;
        }
      
        // Apply the digital root formula
        // Subtract 1 to shift the range, apply modulo 9, then add 1 back
        // This ensures multiples of 9 return 9 instead of 0
        return (num - 1) % 9 + 1;
    }
}
