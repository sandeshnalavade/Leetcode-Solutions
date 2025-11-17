const myAtoi = function (str: string): number {
    // Remove leading and trailing whitespace
    str = str.trim();
  
    // Return 0 for empty string
    if (!str) return 0;
  
    // Track sign of the number (1 for positive, 0 for negative)
    let isPositive: number = 1;
    let index: number = 0;
    let result: number = 0;
  
    // Check for explicit sign character
    if (str[index] === '+') {
        isPositive = 1;
        index++;
    } else if (str[index] === '-') {
        isPositive = 0;
        index++;
    }
  
    // Process digits
    for (; index < str.length; index++) {
        // Convert character to digit (ASCII '0' is 48)
        const digit: number = str.charCodeAt(index) - 48;
      
        // Stop if character is not a digit
        if (digit > 9 || digit < 0) break;
      
        // Check for overflow before updating result
        // INT_MAX = 2147483647, INT_MIN = -2147483648
        if (result > 2147483647 / 10 || result > (2147483647 - digit) / 10) {
            return isPositive ? 2147483647 : -2147483648;
        } else {
            result = result * 10 + digit;
        }
    }
  
    // Return result with appropriate sign
    return isPositive ? result : -result;
};
