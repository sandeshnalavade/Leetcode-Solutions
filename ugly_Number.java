class Solution {
    /**
     * Determines if a number is an ugly number.
     * An ugly number is a positive integer whose only prime factors are 2, 3, and 5.
     * 
     * @param n the number to check
     * @return true if n is an ugly number, false otherwise
     */
    public boolean isUgly(int n) {
        // Ugly numbers must be positive
        if (n < 1) {
            return false;
        }
      
        // Remove all factors of 2
        while (n % 2 == 0) {
            n /= 2;
        }
      
        // Remove all factors of 3
        while (n % 3 == 0) {
            n /= 3;
        }
      
        // Remove all factors of 5
        while (n % 5 == 0) {
            n /= 5;
        }
      
        // If n becomes 1, it means the original number only had factors of 2, 3, and 5
        // Otherwise, it has other prime factors and is not ugly
        return n == 1;
    }
}
