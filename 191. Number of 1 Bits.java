public class Solution {
    /**
     * Calculates the Hamming weight (number of '1' bits) in the binary representation of n.
     * This method treats n as an unsigned 32-bit integer.
     * 
     * @param n the input integer (treated as unsigned)
     * @return the count of '1' bits in the binary representation
     */
    public int hammingWeight(int n) {
        // Initialize counter for number of 1 bits
        int count = 0;
      
        // Continue until all 1 bits are processed
        while (n != 0) {
            // Brian Kernighan's algorithm: n & (n-1) clears the rightmost set bit
            // Example: n = 1100, n-1 = 1011, n & (n-1) = 1000
            n &= n - 1;
          
            // Increment count for each 1 bit cleared
            ++count;
        }
      
        // Return the total count of 1 bits
        return count;
    }
}
