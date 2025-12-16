class Solution {
    /**
     * Determines if a given integer is a power of three.
     * 
     * @param n The integer to check
     * @return true if n is a power of three, false otherwise
     */
    public boolean isPowerOfThree(int n) {
        // Keep dividing by 3 while n is greater than 2
        while (n > 2) {
            // If n is not divisible by 3, it cannot be a power of three
            if (n % 3 != 0) {
                return false;
            }
            // Divide n by 3 to check the next level
            n /= 3;
        }
      
        // After all divisions, n should be 1 if it was a power of three
        // (since 3^0 = 1)
        return n == 1;
    }
}
