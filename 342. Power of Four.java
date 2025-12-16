class Solution {
    /**
     * Determines if a given integer is a power of four.
     * 
     * @param n The integer to check
     * @return true if n is a power of four, false otherwise
     */
    public boolean isPowerOfFour(int n) {
        // Check three conditions:
        // 1. n must be positive (powers of 4 are always positive)
        boolean isPositive = n > 0;
      
        // 2. n must be a power of 2 (using bit manipulation trick)
        //    If n is a power of 2, then n & (n-1) equals 0
        //    Example: 16 (10000) & 15 (01111) = 0
        boolean isPowerOfTwo = (n & (n - 1)) == 0;
      
        // 3. The single bit must be in an even position (0-indexed)
        //    0xAAAAAAAA in binary is 10101010101010101010101010101010
        //    This mask has 1s in all odd positions (1, 3, 5, 7, ...)
        //    Powers of 4 have their single bit in even positions (0, 2, 4, 6, ...)
        //    So n & 0xAAAAAAAA should be 0 for powers of 4
        boolean isBitInEvenPosition = (n & 0xAAAAAAAA) == 0;
      
        // All three conditions must be true
        return isPositive && isPowerOfTwo && isBitInEvenPosition;
    }
}
