class Solution {
    public int majorityElement(int[] nums) {
        // Boyer-Moore Voting Algorithm to find majority element
        // The majority element appears more than n/2 times
      
        int count = 0;      // Counter for current candidate
        int candidate = 0;  // Current majority element candidate
      
        // Iterate through all elements in the array
        for (int num : nums) {
            // If count reaches 0, select current element as new candidate
            if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                // If current element matches candidate, increment count
                // Otherwise, decrement count (cancellation)
                if (candidate == num) {
                    count++;
                } else {
                    count--;
                }
            }
        }
      
        // The remaining candidate is the majority element
        // (Problem guarantees a majority element exists)
        return candidate;
    }
}
